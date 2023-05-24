/*Cargar un arreglo de tamaño 15, pidiendo el ingreso por teclado
de valores entre 1 y 12. Luego mostrar cómo quedó cargado. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp5e1 {
    final static int MAX = 15;

    public static void main(String[] args) {
        int[] arr = new int[MAX];
        cargarArreglo(arr);
        imprimirArreglo(arr);
    }

    public static void cargarArreglo(int[] arr) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int num;
        try {
            for (int i = 0; i < MAX; i++) {
                System.out.println("Ingrese numeros entre 1 y 12");
                num = Integer.valueOf(entrada.readLine());
                if(num >= 1 && num <=12){
                    arr[i] = num;
                }
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void imprimirArreglo(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print("[" + arr[pos] + "]");
        }
        System.out.println("");
    }
}
