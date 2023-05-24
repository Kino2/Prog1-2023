/*Escribir un programa que dado tres números reales ingresados
por el usuario, divida el primero por el segundo y al resultado
obtenido le reste el tercero. Muestre por pantalla el resultado
obtenido. Puede o no usar variables auxiliares para los cálculos.
Tenga en cuenta posibles errores en las operaciones. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp1e7 {
    public static void main (String[]args){
    double numOne, numTwo, numThree;
    try {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el primer numero");
        numOne = Double.valueOf(entrada.readLine());
        System.out.println("Ingrese el segundo numero");
        numTwo = Double.valueOf(entrada.readLine());
        System.out.println("Ingrese el tercer numero");
        numThree = Double.valueOf(entrada.readLine());
        System.out.println("El resultado es " + ((numOne/numTwo)-numThree));
    } catch (Exception exc) {
        System.out.print(exc);
    }
    }
}
