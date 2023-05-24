/*Hacer un programa que elimine de un arreglo todas las
secuencias que tienen orden descendente entre sus elementos. */

import java.util.Random;

public class Tp5e21 {
    static final int MAX = 20;
    static final int MAXVALOR = 10;
    static final int MINVALOR = 1;
    static final double PROBABILIDAD = 0.4;
    public static void main (String [] args){
        int [] arr = new int [MAX];
        cargarSecuencias(arr);
        imprimirArreglo(arr);
        eliminarOrdenDesc(arr);
        imprimirArreglo(arr);
    }

    public static void eliminarOrdenDesc(int [] arr){
        int fin = -1;
        int inicio = obtenerInicio(arr, fin + 1);
        while(inicio < MAX){
            fin = obtenerFin(arr, inicio);
            if(esDescendente(arr, inicio, fin)){
                eliminarSec(arr, inicio, fin);
            }
            inicio = obtenerInicio(arr, fin + 1);
        }
    }

    public static boolean esDescendente(int [] arr, int inicio, int fin){
        int tam = fin - inicio + 1;
        while ((inicio < fin) && (arr[inicio] > arr [inicio + 1])){
            inicio++;
        }
        if ((inicio == fin) && (tam > 1)){
            return true;
        } else {
            return false;
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
    public static int obtenerInicio(int [] arr, int pos){
        while((pos < MAX) && (arr[pos] == 0)){
            pos++;
        }
        return pos;
    }

    public static int obtenerFin(int [] arr, int pos){
        while ((pos < MAX) && (arr[pos] != 0)){
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
