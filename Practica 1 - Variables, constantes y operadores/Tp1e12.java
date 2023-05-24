/*Escribir un programa que permita ingresar dos números enteros,
incremente el primero y decremente el segundo, para luego
mostrar por pantalla en ambos casos, el valor original y el
modificado. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp1e12 {
    public static void main (String [] args){
        int num1, num2, num1Mod, num2Mod;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un entero");
            num1 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese otro entero");
            num2 = Integer.valueOf(entrada.readLine());
            num1Mod = num1++;
            num2Mod = num2--;
            System.out.println("El valor del primer entero es " +num1Mod + " y si lo incremento es " +num1 );
            System.out.println("El valor del segundo entero es " +num2Mod + " y si lo incremento es " + num2);
        } catch (Exception exc){
            System.out.print(exc);
        }
    }
}
