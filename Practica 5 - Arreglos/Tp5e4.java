/*Buscar un elemento en un arreglo de caracteres ya cargado de
tamaño 10 y mostrar la/s posición/es del elemento, en caso de no
estar indicarlo también. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Tp5e4 {
    final static int MAX = 10;

    public static void main(String[] args) {
        char[] arr = new char[MAX];
        char caracter;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter");
            caracter = entrada.readLine().charAt(0);
            cargarArreglo(arr);
            imprimirArreglo(arr);
            encontrarElemento(arr, caracter);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
    public static void encontrarElemento(char[] arr, char caracter){
        for(int pos = 0; pos < MAX; pos++){
            if(arr[pos] == caracter){
                System.out.println(caracter + " se encuentra en la posicion " + pos);
        }
    }
}
public static void imprimirArreglo(char [] arr) {
    for (int pos = 0; pos < MAX; pos++) {
        System.out.print("[" + arr[pos] + "]");
    }
    System.out.println("");
}

    public static void cargarArreglo(char[] arr) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arr[pos] = (char) (r.nextInt(26) + 'a');
        }
    }
}