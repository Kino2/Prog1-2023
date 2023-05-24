/* 18) Escribir un programa que mientras que el usuario ingrese un
número distinto de 0, pida ingresar otros dos números e imprima
el resultado de la división entre los dos últimos números
ingresados. ¿Existe alguna restricción para la división? */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2e18 {
    public static void main (String []args){
        int numPrincipal, segNum, terNum;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entero");
            numPrincipal = Integer.valueOf(entrada.readLine());
            while (numPrincipal !=0){
                System.out.println("Ingrese un numero entero");
                segNum = Integer.valueOf(entrada.readLine());
                System.out.println("Ingrese un numero entero");
                terNum = Integer.valueOf(entrada.readLine());
                System.out.println("El resultado de la división entre los dos últimos números ingresados es: " + segNum/terNum);
                System.out.println("Ingrese un numero entero");
                numPrincipal = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception exc) {
            System.out.println(exc);
    }
    ;
  }
}