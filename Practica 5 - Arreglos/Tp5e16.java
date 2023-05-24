/*Hacer un programa que devuelva la posición de inicio y fin de la
secuencia de números distintos de ceros cuya suma del contenido
sea mayor. */

import java.util.Random;

public class Tp5e16 {
    static final int MAX = 20;
    static final int MAXVALOR = 10;
    static final int MINVALOR = 1;
    static final double PROBABILIDAD = 0.3;

    public static void main(String[] args) {
        int[] arr = new int[MAX];
        cargarSecuencias(arr);
        imprimirArreglo(arr);
        inicioYfinSecMayor(arr);
    }

    public static void inicioYfinSecMayor(int[] arr) {
        int inicio = 0;
        int fin = -1;
        int suma = 0;
        int inicioMayor = 0;
        int finMayor = -1;
        int sumaMayor = 0;
        
        for (int i = 0; i < MAX; i++) {
            inicio = obtenerInicioSec(arr, fin + 1);
            fin = obtenerFinSec(arr, inicio);
            suma = obtenerSuma(arr, inicio, fin);
            
            if (suma > sumaMayor) {
                sumaMayor = suma;
                inicioMayor = inicio;
                finMayor = fin;
            }
        }
        
        System.out.println("Inicio " + inicioMayor + " Fin " + finMayor + " suma = " + sumaMayor);
    }

    public static int obtenerSuma(int[] arr, int inicio, int fin) {
        int suma = 0;
        for (int i = inicio; i <= fin; i++) {
            suma += arr[i];
        }
        return suma;
    }

    public static int obtenerInicioSec(int[] arr, int pos) {
        while (pos < MAX && arr[pos] == 0) {
            pos++;
        }
        return pos;
    }

    public static int obtenerFinSec(int[] arr, int pos) {
        while (pos < MAX && arr[pos] != 0) {
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
        System.out.println();
    }
}
