/*Hacer un programa que dado un arreglo ya cargado con 10
enteros, calcule el promedio y lo muestre por la consola. */

import java.util.Random;

public class Tp5e2 {
    final static int MAX = 10;
    final static int MAXVALOR = 10;
    final static int MINVALOR = 1;
    public static void main (String []args){
        int [] arr = new int [MAX];
        cargarArreglo(arr);
        imprimirArreglo(arr);
        calculoPromedio(arr);
    }
    public static void calculoPromedio(int [] arr){
        int suma = 0;
        for (int i = 0; i<MAX; i++){
            suma += arr[i];
        }
        double promedio = suma/MAX;
        System.out.println("La suma de los numeros del arreglo es " + suma);
        System.out.println("El promedio de los numeros del arreglo es " + promedio);
    }
    public static void cargarArreglo(int [] arr){
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++){
        arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
        }
    }
    public static void imprimirArreglo(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print("[" + arr[pos] + "]");
        }
        System.out.println("");
    }
}
