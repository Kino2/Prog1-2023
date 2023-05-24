/*Hacer un programa que dado un arreglo de enteros de tamaño 10
que se encuentra cargado, solicite al usuario un número entero y
lo agregue al principio del arreglo (posición 0). Para ello tendrá
que realizar un corrimiento a derecha (se pierde el último valor del
arreglo) y colocar el número en el arreglo en la posición indicada. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Tp5e9 {
    static final int MAX = 10;
    static final int MAXVALOR = 10;
    static final int MINVALOR = 1;
    public static void main (String [] args){
        int [] arr = new int [MAX];
        int num, pos = 0;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            cargarArreglo(arr);
            imprimirArreglo(arr);
            System.out.println("Ingrese un numero");
            num = Integer.valueOf(entrada.readLine());
            corrimientoDer(arr, pos, num);
            imprimirArreglo(arr);
        } catch (Exception exc){
            System.out.println(exc);
        }
    }    
    public static void corrimientoDer(int [] arr, int pos, int num){
        int indice = MAX - 1;
        while (indice > pos) {
            arr[indice] = arr[indice - 1];
            indice--;
        } 
        arr[pos] = num;
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
