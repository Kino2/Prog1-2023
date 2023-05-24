/*Con el mismo arreglo del ejercicio anterior informe por pantalla
cuantos elementos del mismo están por encima del promedio
calculado. */

import java.util.Random;

public class Tp5e3 {
    final static int MAX = 10;
    final static int MAXVALOR = 10;
    final static int MINVALOR = 1;

    public static void main(String[] args) {
        int[] arr = new int[MAX];
        int cantMayor;
        double promedio;
        cargarArreglo(arr);
        imprimirArreglo(arr);
        promedio = calculoPromedio(arr);
        cantMayor = cantSobrePromedio(arr, promedio);
        System.out.println("El promedio es de " + promedio);
        System.out.println("Hay " + cantMayor + " elementos mayor al promedio");
    }

    public static double calculoPromedio(int[] arr) {
        int suma = 0;
        for (int i = 0; i < MAX; i++) {
            suma += arr[i];
        }
        double promedio = suma / MAX;
        return promedio;
    }

    public static int cantSobrePromedio(int[] arr, double promedio) {
        int cant = 0;
        for (int i = 0; i < MAX; i++) {
            if (arr[i] > promedio) {
                cant++;
            }
        }
        return cant;
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
