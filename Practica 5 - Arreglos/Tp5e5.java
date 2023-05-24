/*Hacer un programa que dado un arreglo de caracteres de tamaño
10 que se encuentra cargado, invierta el orden del contenido. Este
intercambio no se debe realizar de manera explícita, hay que
hacer un método que incluya una iteración de intercambio. */

import java.util.Random;

public class Tp5e5 {
    final static int MAX = 10;

    public static void main(String[] args) {
        char[] arr = new char[MAX];
        cargarArreglo(arr);
        imprimirArreglo(arr);
        invertirArreglo(arr);
        imprimirArreglo(arr);
    }
    public static void invertirArreglo(char [] arr){
        char aux;
        for (int pos = 0; pos < MAX/2; pos++){
            aux = arr[pos];
            arr[pos] = arr[MAX-1-pos];
            arr[MAX-1-pos] = aux;
        }   
    }
    public static void cargarArreglo(char[] arr) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arr[pos] = (char) (r.nextInt(26) + 'a');
        }
    }

    public static void imprimirArreglo(char[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print("[" + arr[pos] + "]");
        }
        System.out.println("");
    }
}
