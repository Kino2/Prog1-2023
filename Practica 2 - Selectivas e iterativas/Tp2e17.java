/* 17) Escribir un programa que dado un valor ingresado por el
usuario menor que 10 y mayor a 1, muestre por pantalla una
cuenta regresiva de números desde dicho valor hasta el 0
inclusive. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2e17 {
    public static void main (String[]args){
        int num;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero menor que 10 y mayor a 1");
            num = Integer.valueOf(entrada.readLine());
            if (num > 10 || num < 1){
                System.out.println("El numero no cumple con las condiciones que se piden"); 
            }    
            while(num >= 1 && num < 10){
                num--;
                    System.out.println(num);
            }
      
        } catch (Exception exc){
            System.out.println(exc);
        }
    }
}
