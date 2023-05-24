/*Escribir un programa que permita el ingreso de dos números
enteros por teclado e imprima:
a. si el primero es mayor al segundo.
b. si ambos son múltiplos de 2. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp1e10 {
    public static void main (String [] args){
        int num1, num2;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un entero");
            num1 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese otro entero");
            num2 = Integer.valueOf(entrada.readLine());
            if((num1>num2)&&(num1 % 2 == 0)&&(num2 % 2 == 0)){
                System.out.println("El primero es mayor al segundo y los 2 numeros son multiplos de 2");
            } else if (num1>num2){
                System.out.println(num1 + " es mayor a " + num2);
            } else if ((num1 % 2 == 0)&&(num2 % 2 == 0)){
                System.out.println("Ambos numeros son multiplos de 2");
            } else {
                System.out.println("El primero no es mayor al segundo o ambos numeros no son multiplos de 2");
            }
            } catch (Exception exc){
            System.out.println(exc);
        }
    }
}
