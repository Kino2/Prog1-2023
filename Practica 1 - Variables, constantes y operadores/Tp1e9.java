/*Escribir un programa que permita el ingreso de un número entero
por teclado e imprima el cociente de la división de dicho número
por 2, 3, y 4. En base a los resultados obtenidos analice cada
caso si es correcto o no. */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp1e9 {
    public static void main (String[]args){
        int num;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un entero");
            num = Integer.valueOf(entrada.readLine());
            System.out.println("El cociente de la division si lo divido por 2 es: " + (num / 2));
            System.out.println("El cociente de la division si lo divido por 3 es: " + (num / 3));
            System.out.println("El cociente de la division si lo divido por 4 es: " + (num / 4));
        } catch (Exception exc){
            System.out.println(exc);
        }
    }
}
