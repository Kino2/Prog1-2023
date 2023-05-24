/*Hacer un programa que devuelva la posición de inicio y fin de la
primera secuencia de números distinta de ceros. */

import java.util.Random;

public class Tp5e15 {
    static final int MAX = 20;
    static final int MAXVALOR = 10;
    static final int MINVALOR = 1;
    static final double PROBABILIDAD = 0.3;

    public static void main(String[] args) {
        int[] arr = new int[MAX];
        int inicio, fin;
        cargarSecuencias(arr);
        imprimirArreglo(arr);
        inicio = obtenerInicioSec(arr);
        fin = obtenerFinSec(arr, inicio);
        System.out.println("El inicio de la primer secuencia es en la posicion "+ inicio + " y el final en la " +fin);
    }

    public static int obtenerInicioSec(int[] arr) {
        int pos = 0;
        while ((pos < MAX) && (arr[pos] == 0)) {
            pos++;
        }
        return pos;
    }

    public static int obtenerFinSec(int[] arr, int pos) {
        while ((pos < MAX) && (arr[pos] != 0)) {
            pos++;
        }
        return pos - 1;
    }

    public static void cargarSecuencias(int[] arr) {
        Random r = new Random();
        arr[0] = 0;
        arr[MAX - 1] = 0;
        for (int pos = 1; pos < MAX - 1; pos++) {
            if (r.nextDouble() > PROBABILIDAD) {
                arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
            } else {
                arr[pos] = 0;
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
