/*Implementar un método que realice un corrimiento a derecha en
un arreglo ordenado de tamaño MAX=10 a partir de una posición. */

import java.util.Random;

public class Tp5e7 {
    static final int MAX = 10;
    static final int MAXVALOR = 10;
    static final int MINVALOR = 1;

    public static void main(String[] args) {
        int[] arr = new int[MAX];
        int pos = 7;
        cargarArreglo(arr);
        imprimirArreglo(arr);
        corrimientoDer(arr, pos);
        imprimirArreglo(arr);
    }

    public static void corrimientoDer(int[] arr, int pos) {
        int indice = MAX - 1;
        while (indice > pos) {
            arr[indice] = arr[indice - 1];
            indice--;
        }
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
