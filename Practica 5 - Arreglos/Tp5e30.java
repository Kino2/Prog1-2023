/*Hacer un programa que cargue un arreglo (sin orden) de
tamaño MAX=10 con números enteros aleatorios entre 0 y 100.
Finalmente imprima por pantalla el arreglo ordenado. Hacerlo para
orden creciente y decreciente */

import java.util.Random;

public class Tp5e30 {
    static final int MAX = 10;
    static final int MAXVALOR = 100;
    static final int MINVALOR = 0;

    public static void main(String[] args) {
        int[] arr = new int[MAX];
        cargarArreglo(arr);
        System.out.println("Arreglo desordenado");
        imprimirArreglo(arr);
        System.out.println("Arreglo ordenado de forma creciente");
        imprimirArregloOrdenadoCreciente(arr);
        System.out.println("Arreglo ordenado de forma decreciente");
        imprimirArregloOrdenadoDecreciente(arr);
    }

    public static void imprimirArregloOrdenadoCreciente(int[] arr) {
        int temp;
        for (int i = 1; i < MAX; i++) {
            for (int j = 0; j < MAX - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        imprimirArreglo(arr);
    }

    public static void imprimirArregloOrdenadoDecreciente(int[] arr) {
        int temp;
        for (int i = 1; i < MAX; i++) {
            for (int j = 0; j < MAX - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        imprimirArreglo(arr);
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
        System.out.println();
    }
}
