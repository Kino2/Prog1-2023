
/*Hacer un programa que dado un arreglo ordenado creciente de
enteros de tamaño 10 que se encuentra precargado, solicite al
usuario un número entero y lo inserte en el arreglo manteniendo
su orden. Para ello tendrá que realizar un corrimiento a derecha
(se pierde el último valor del arreglo) y colocar el número en el
arreglo en la posición indicada. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Tp5e27 {
    static final int MAX = 10;
    static final int MAXVALOR = 10;
    static final int MINVALOR = 1;

    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[MAX];
        int num;
        try {
            cargarArreglo(arr);
            imprimirArreglo(arr);
            System.out.println("Ingrese un numero");
            num = Integer.valueOf(entrada.readLine());
            insertar_en_arreglo(arr, num);
            imprimirArreglo(arr);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void insertar_en_arreglo(int[] arr, int num) {
        int pos = obtenerPos(arr, num);
        corrimientoDer(arr, pos);
        arr[pos] = num;
    }

    public static void corrimientoDer(int[] arr, int pos) {
        int indice = MAX - 1;
        while (indice > pos) {
            arr[indice] = arr[indice - 1];
            indice--;
        }
    }

    public static int obtenerPos(int[] arr, int num) {
        int pos = 0;
        while ((pos < MAX) && (arr[pos] < num)) {
            pos++;
        }
        return pos;
    }

    public static void cargarArreglo(int[] arr) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
        }
        ordenarArreglo(arr);
    }

    public static void ordenarArreglo(int[] arr) {
        int posMenor, temp;
        for (int i = 0; i < MAX; i++) {
            posMenor = i;
            for (int j = i + 1; j < MAX; j++) {
                if (arr[j] < arr[posMenor]) {
                    posMenor = j;
                }
            }
            if (posMenor != i) {
                temp = arr[i];
                arr[i] = arr[posMenor];
                arr[posMenor] = temp;
            }
        }
    }

    public static void imprimirArreglo(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print("[" + arr[pos] + "]");
        }
        System.out.println("");
    }
}
