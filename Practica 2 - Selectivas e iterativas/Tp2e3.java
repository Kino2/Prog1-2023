/* 3) Escribir un programa que solicite el ingreso de un número mayor a
50, y lo muestre por pantalla en caso de ser múltiplo de 2 o 3. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2e3 {
    public static void main (String [] args){
        int num;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero mayor a 50");
            num = Integer.valueOf(entrada.readLine());
            if(num > 50){
                if((num % 2 == 0)||(num % 3 == 0)){
                    System.out.println(num);
                }
            } else {
                System.out.println("El numero no es mayor a 50");
            }
        } catch (Exception exc){
            System.out.println(exc);
        }
    }
}
