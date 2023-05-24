/*Escribir un programa que declare una constante de tipo int y pida el
ingreso de un valor por teclado. Luego muestre el valor ingresado.
¿Qué pasa en este caso? ¿Se puede o surge algún problema? */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp1e3 {
    public static void main (String[]args){
        final int constNum = 16;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println ("Ingrese un valor entero: ");
            int numJoined = Integer.valueOf(entrada.readLine());
            System.out.println("El valor ingresado es: " + numJoined);
        } catch(Exception exc){
            System.out.print(exc);
        }
    }
}

//No surge ningun problema