/*Hacer un programa que dado un arreglo ordenado creciente de
enteros de tamaño 10 que se encuentra precargado, solicite al
usuario un número entero y elimine la primera ocurrencia de
número (un número igual) en el arreglo (si existe). Informar si no
existe en el arreglo. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Tp5e28 {
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
            eliminarOcurrencia(arr, num);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void eliminarOcurrencia(int[] arr, int num) {
        if (existeOcurrencia(arr, num)) {
            int pos = obtenerPos(arr, num);
            corrimientoIzq(arr, pos);
            imprimirArreglo(arr);
        } else {
            System.out.println("El numero no existe en el arreglo");
        }
    }

    public static boolean existeOcurrencia(int[] arr, int num) {
        for (int i = 0; i < MAX; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static void corrimientoIzq(int[] arr, int pos) {
        for (int i = pos; i < MAX - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }

    public static int obtenerPos(int[] arr, int num) {
        int pos = 0;
        while ((pos < MAX) && (arr[pos] != num)) {
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
