/*Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra precargado, solicite al usuario un número
entero y elimine la primera ocurrencia del número (un número
igual) en el arreglo (si existe). Para ello tendrá que buscar la
posición y si está, realizar un corrimiento a izquierda (queda una
copia de la última posición del arreglo en la anteúltima posición). */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Tp5e10 {
    static final int MAX = 10;
    static final int MAXVALOR = 10;
    static final int MINVALOR = 1;

    public static void main(String[] args) {
        int[] arr = new int[MAX];
        int num, pos;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            cargarArreglo(arr);
            imprimirArreglo(arr);
            System.out.println("Ingrese un numero");
            num = Integer.valueOf(entrada.readLine());
            pos = encontrar_pos(arr, num);
            if ((pos < MAX) && (arr[pos] == num)) {
                corrimientoIzq(arr, pos);
                imprimirArreglo(arr);
            } else {
                System.out.println("No se encontró el numero en el arreglo");
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static int encontrar_pos(int[] arr, int num) {
        int pos = 0;
        while ((pos < MAX) && (arr[pos] != num)) {
            pos++;
        }
        return pos;
    }

    public static void corrimientoIzq(int[] arr, int pos) {
        for (int i = pos; i < MAX - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }

    public static void cargarArreglo(int[] arr) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
        }
    }

    public static void imprimirArreglo(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print("[" + arr[pos] + "]");
        }
        System.out.println("");
    }
}
