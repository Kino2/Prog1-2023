/*Hacer un programa que devuelva la posición de inicio y fin de la
anteúltima secuencia de números distintos de ceros. */

import java.util.Random;

public class Tp5e17 {
    static final int MAX = 20;
    static final int MAXVALOR = 10;
    static final int MINVALOR = 1;
    static final double PROBABILIDAD = 0.4;
    public static void main (String [] args){
        int [] arr = new int [MAX];
        cargarSecuencias(arr);
        imprimirArreglo(arr);
        inicio_fin_anteultima_secuencia(arr);
    }
    public static void inicio_fin_anteultima_secuencia(int [] arr){
        int fin = obtenerFinSec(arr, MAX-1);
        int inicio = obtenerInicioSec(arr, fin);
        fin = obtenerFinSec(arr, inicio - 1);
        inicio = obtenerInicioSec(arr, fin);
        System.out.println("El inicio de la anteultima secuencia es: " + inicio + " y el fin " + fin);
    }
    public static int obtenerFinSec(int [] arr, int pos){
        while((pos > 0)&&(arr[pos] == 0)){
            pos--;
        }
        return pos;
    }
    public static int obtenerInicioSec(int[]arr, int pos){
      while((pos > 0)&&(arr[pos] != 0)){
        pos--;
      }  
     return  pos + 1;
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

