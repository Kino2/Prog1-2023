/*Escribir un programa que permita ingresar 5 números de a uno por
vez y que los muestre por pantalla en orden inverso:
Ejemplo: Ingreso: 23, 4, 2, 100, 3
Se debe mostrar: 3, 100, 2, 4, 23 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp1e4 {
   public static void main (String[]args){
    int numOne, numTwo, numThree, numFour, numFive;
    try {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese 5 numeros");
        System.out.println("Ingrese el primer numero");
        numOne = Integer.valueOf(entrada.readLine());
        System.out.println("Ingrese el segundo numero");
        numTwo = Integer.valueOf(entrada.readLine());
        System.out.println("Ingrese el tercer numero");
        numThree = Integer.valueOf(entrada.readLine());
        System.out.println("Ingrese el cuarto numero");
        numFour = Integer.valueOf(entrada.readLine());
        System.out.println("Ingrese el quinto numero");
        numFive = Integer.valueOf(entrada.readLine());
        System.out.println("Los numeros ingresados son: " + numOne + ", " + numTwo + ", " + numThree + ", " + numFour + ", " + numFive);
        System.out.println("Ordenados a la inversa: " + numFive + ", " + numFour + ", " + numThree + ", " + numTwo + ", " + numOne);
    } catch (Exception exc) {
        System.out.println(exc);
    }
   } 
}
