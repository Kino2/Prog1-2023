/* 14) Pedir por consola el ingreso de 10 números enteros positivos.
Contar cuántas veces se ingresaron números pares y mostrarlo
por pantalla. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2e14 {
    public static void main (String[]args){
        int cantNum = 0, cantPares = 0, num;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entero positivo");
            num = Integer.valueOf(entrada.readLine());
            while ((num >= 0)&&(cantNum < 10)){
                cantNum++;
                if(num % 2 == 0){
                    cantPares++;
                }
                System.out.println("Ingrese un numero entero positivo");
                num = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception exc){
            System.out.println(exc);
        }
        System.out.println("Se ingresaron " +cantPares + " numeros pares");
    }    
}
