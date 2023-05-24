/*Hacer un programa que dado un arreglo de enteros de tamaño 10
que se encuentra cargado, obtenga la cantidad de números pares
que tiene y la imprima. */

import java.util.Random;

public class Tp5e6 {
    static final int MAX = 10;
    static final int MAXVALOR = 10;
    static final int MINVALOR = 1;

    public static void main(String[] args) {
        int[] arr = new int[MAX];
        int pares;
        cargarArreglo(arr);
        imprimirArreglo(arr);
        pares = cantPares(arr);
        System.out.println("La cantidad de pares es " + pares);
    }

    public static int cantPares(int[] arr) {
        int pares = 0;
        for (int i = 0; i < MAX; i++) {
            if (arr[i] % 2 == 0) {
                pares++;
            }
        }
        return pares;
    }

    public static void cargarArreglo(int [] arr){
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++){
        arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
        }
    }
    public static void imprimirArreglo(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print("[" + arr[pos] + "]");
        }
        System.out.println("");
    }
}
