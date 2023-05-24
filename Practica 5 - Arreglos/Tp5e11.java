/*Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra precargado, solicite al usuario un número
entero y elimine todas las ocurrencia de número en el arreglo.
Mientras exista (en cada iteración tiene que buscar la posición
dentro del arreglo) tendrá que usar la posición para realizar un
corrimiento a izquierda (quedarán tantas copias de la última
posición del arreglo como cantidad de ocurrencias del número). */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Tp5e11 {
    static final int MAX = 10;
    static final int MAXVALOR = 10;
    static final int MINVALOR = 1;

    public static void main(String[] args) {
        int[] arr = new int[MAX];
        int num, cant;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            cargarArreglo(arr);
            imprimirArreglo(arr);
            System.out.println("Ingrese un numero que desee eliminar");
            num = Integer.valueOf(entrada.readLine());
            cant = obtenerCantidad(arr, num);
            if (cant > 0) {
                eliminarNum(arr, num);
                imprimirArreglo(arr);
            } else {
                System.out.println("El numero que ingresaste no está en el arreglo");
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static int obtenerCantidad(int[] arr, int num) {
        int contador = 0;
        for (int pos = 0; pos < MAX; pos++) {
            if (arr[pos] == num) {
                contador++;
            }
        }
        return contador;
    }

    public static void eliminarNum(int[] arr, int num) {
        for (int pos = 0; pos < MAX; pos++) {
            if (arr[pos] == num) {
                corrimientoIzq(arr, pos);
            }
        }
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
