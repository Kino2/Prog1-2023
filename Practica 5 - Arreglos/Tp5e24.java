/*Se tiene un arreglo de enteros de tamaño 20 de secuencias de
números entre 1 y 9, separadas por 0. El arreglo está precargado,
y además empieza y termina con uno o más separadores 0. Hacer
un programa que permita obtener a través de métodos la posición
de inicio y la posición de fin de la secuencia ubicada a partir de
una posición entera ingresada por el usuario. Finalmente, si
existen imprima por pantalla ambas posiciones obtenidas. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Tp5e24 {
    static final int MAX = 20;
    static final int MAXVALOR = 9;
    static final int MINVALOR = 1;
    static final double PROBABILIDAD = 0.4;

    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[MAX];
        int numPos;
        try {
            cargarSecuencias(arr);
            imprimirArreglo(arr);
            System.out.println("Ingrese una posicion");
            numPos = Integer.valueOf(entrada.readLine());
            if ((numPos > 0) && (numPos <= MAX - 1) && (arr[numPos] != 0)) {
                obtenerSecuenciaDesdePos(arr, numPos);
            } else {
                System.out.println("No hay ninguna secuencia en esa posición");
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void obtenerSecuenciaDesdePos(int[] arr, int numPos) {
        int inicio = obtenerInicio(arr, numPos);
        int fin = obtenerFin(arr, inicio);
        System.out.println("El inicio de la secuencia es " + inicio + " y el fin es " + fin);
    }

    public static int obtenerInicio(int[] arr, int numPos) {
        while ((numPos > 0) && (arr[numPos] != 0)) {
            numPos--;
        }
        return numPos + 1;
    }

    public static int obtenerFin(int[] arr, int inicio) {
        while ((inicio < MAX) && (arr[inicio] != 0)) {
            inicio++;
        }
        return inicio - 1;
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
