/*Hacer un programa que dado un número N ingresado por el
usuario, elimine las secuencias de tamaño N de números distintos
de cero. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Tp5e19 {
    static final int MAX = 20;
    static final int MAXVALOR = 10;
    static final int MINVALOR = 1;
    static final double PROBABILIDAD = 0.4;

    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[MAX];
        try {
            cargarSecuencias(arr);
            imprimirArreglo(arr);
            System.out.println("Ingrese un numero");
            int num = Integer.valueOf(entrada.readLine());
            eliminarSecuenciaTamanio(arr, num);
            imprimirArreglo(arr);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void eliminarSecuenciaTamanio(int[] arr, int num) {
        int tam = 0;
        int fin = -1;
        int inicio = obtenerInicioSec(arr, fin + 1);
        while ((inicio < MAX)) {
            fin = obtenerFinSec(arr, inicio);
            tam = fin - inicio + 1;
            if (num == tam) {
                eliminarSec(arr, inicio, fin);
            }
            inicio = obtenerInicioSec(arr, fin + 1);
        }
    }

    public static void eliminarSec(int[] arr, int inicio, int fin) {
        for (int i = inicio; i <= fin; i++) {
            corrimientoIzq(arr, inicio);
        }
    }

    public static void corrimientoIzq(int[] arr, int inicio) {
        for (int i = inicio; i < MAX - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }

    public static int obtenerInicioSec(int[] arr, int pos) {
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
        System.out.println();
    }
}
