/*Escribir un programa que permita el ingreso de un número entero
por teclado e imprima el resultado de determinar:
a. si es múltiplo de 6 y de 7,
b. si es mayor a 30 y múltiplo de 2, o es menor igual a 30,
c. si el cociente de la división de dicho número por 5 es mayor que 10*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp1e11 {
    public static void main (String [] args){
        int num;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un entero");
            num = Integer.valueOf(entrada.readLine());
            if((num % 6 == 0)&&(num % 7 == 0)){
                System.out.println("Es multiplo de 6 y de 7");
            } else if ((num > 30 && num % 2 == 0)|| (num<=30)){
                System.out.println("Es mayor a 30 y multiplo de 2 o es menor igual a 30");
            } else if ((num / 5) > 10){
                System.out.println("El cociente de la division del entero por 5 es mayor que 10");
            }
        } catch (Exception exc){
            System.out.print(exc);
        }
    }
    
}
