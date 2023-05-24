/*Hacer un programa que devuelva la posición de inicio y de fin
de la secuencia de mayor tamaño. */

import java.util.Random;
public class Tp5e18 {
    static final int MAX = 20;
    static final int MAXVALOR = 10;
    static final int MINVALOR = 1;
    static final double PROBABILIDAD = 0.4;
    public static void main (String [] args){
        int [] arr = new int [MAX];
        cargarSecuencias(arr);
        imprimirArreglo(arr);
        obtenerTamanio(arr);
    }
    public static void obtenerTamanio(int [] arr){
        int tam = 0;
        int tamMayor = 0;
        int inicio = 0;
        int fin = -1;
        int iniMayor = 0;
        int finMayor = 0;
        while(inicio < MAX){
            inicio = obtenerInicioSec(arr, fin + 1);
            if (inicio < MAX){
                fin = obtenerFinSec(arr, inicio);
                tam = fin - inicio + 1;
                if(tam > tamMayor){
                    tamMayor = tam;
                    iniMayor = inicio;
                    finMayor = fin;
                }
            }
            inicio++;
        }
        System.out.println("La secuencia que mayor tamaño tiene arranca en " +iniMayor + " y termina en " +finMayor + " su tamaño es " + tamMayor);
    }
    public static int obtenerInicioSec(int [] arr, int pos){
        while((pos < MAX-1)&&(arr[pos] == 0)){
            pos++;
        }
        return pos;
    }
    public static int obtenerFinSec(int[]arr, int pos){
      while((pos <MAX-1)&&(arr[pos] != 0)){
        pos++;
      }  
     return  pos - 1;
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

