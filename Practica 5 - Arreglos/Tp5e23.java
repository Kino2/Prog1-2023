/*Hacer un programa que invierta el orden de la última secuencia
en un arreglo. */

import java.util.Random;

public class Tp5e23 {
    static final int MAX = 20;
    static final int MAXVALOR = 10;
    static final int MINVALOR = 1;
    static final double PROBABILIDAD = 0.3;
    public static void main (String [] args){
        int [] arr = new int [MAX];
        cargarSecuencias(arr);
        imprimirArreglo(arr);
        invertirUltimaSec(arr);
        imprimirArreglo(arr);
    }

    public static void invertirUltimaSec(int [] arr){
        int fin = obtenerFinSec(arr, MAX-1);
        int inicio = obtenerInicioSec(arr, fin); 
        invertir(arr, inicio, fin);  
    }
    public static void invertir(int []arr, int inicio, int fin){
        int aux;
        int tamanio = fin - inicio;
        for (int pos = inicio; pos <= inicio + tamanio / 2; pos++) { // Corrección: <= en lugar de <
            aux = arr[pos];
            arr[pos] = arr[fin - pos + inicio]; // Corrección: fin-1-pos debe ser fin-pos+inicio
            arr[fin - pos + inicio] = aux; // Corrección: fin-1-pos debe ser fin-pos+inicio
        }
    }
    public static int obtenerFinSec(int [] arr, int pos){
       while ((pos > 0)&&(arr[pos]== 0)){
            pos--;
        }
        return pos;
    }

    public static int obtenerInicioSec(int [] arr, int pos){
        while ((pos > 0) && (arr[pos]!=0)){
            pos--;
        }
        return pos + 1;
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
