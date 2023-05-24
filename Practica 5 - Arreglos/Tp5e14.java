/*Hacer un programa que elimine los valores pares en un arreglo
de tamaño MAX=10. */

import java.util.Random;

public class Tp5e14 {
    static final int MAX = 10;
    static final int MAXVALOR = 10;
    static final int MINVALOR = 1;

    public static void main(String[] args) {
        int[] arr = new int[MAX];
        cargarArreglo(arr);
        imprimirArreglo(arr);
        eliminarPares(arr);
        imprimirArreglo(arr);
    }

    public static void eliminarPares(int[] arr) {
        int pos = 0;
        int tam = MAX;
        while (pos < tam) {
            if (arr[pos] % 2 == 0) {
                corrimientoIzq(arr, pos, tam);
                tam--;
            } else {
                pos++;
            }
        }
    }

    public static void corrimientoIzq(int[] arr, int pos, int tam) {
        for (int i = pos; i < tam - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }

    public static void cargarArreglo(int[] arreglo) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arreglo[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
        }
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print("[" + arreglo[pos] + "]");
        }
        System.out.println("");
    }
}
