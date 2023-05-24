/*Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra precargado, solicite al usuario el ingreso de
dos números enteros (posiciones del arreglo) y ordene de forma
creciente el arreglo entre dos posiciones correspondientes a los
números ingresados. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Tp5e29 {
    static final int MAX = 10;
    static final int MAXVALOR = 10;
    static final int MINVALOR = 1;   
    public static void main (String [] args){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int [MAX];
        int pos, pos2;
        try {
            cargarArreglo(arr);
            imprimirArreglo(arr);
            System.out.println("Ingrese una posicion");
            pos = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese otra posicion");
            pos2 = Integer.valueOf(entrada.readLine());
            ubicar_num_en_pos(arr, pos, pos2);
            imprimirArreglo(arr);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void ubicar_num_en_pos(int [] arr, int pos, int pos2){
        ordenar_entre_pos(arr, pos, pos2);
    }

    public static void ordenar_entre_pos(int[] arr, int posInicio, int posFin) {
        int posMenor, aux;
        for (int i = posInicio; i <= posFin; i++) {
            posMenor = i;
            for (int j = i + 1; j <= posFin; j++) {
                if (arr[j] < arr[posMenor]) {
                    posMenor = j;
                }
            }
            if (posMenor != i) {
                aux = arr[i];
                arr[i] = arr[posMenor];
                arr[posMenor] = aux;
            }
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
        System.out.println();
    }
}
