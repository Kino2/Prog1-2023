/* 9) Escribir un programa que mientras que el usuario ingrese un
número entero distinto de 0, pida ingresar otro número entero y lo
imprima. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2e9 {
    public static void main (String[]args){
        int num, num2;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entero distinto a 0");
            num = Integer.valueOf(entrada.readLine());
            while(num!=0){
                if(num!=0){
                    System.out.println("Ingrese otro numero");
                    num2 = Integer.valueOf(entrada.readLine());
                    System.out.println("El numero es: " + num2);
                    }
                    System.out.println("Ingrese un numero entero distinto a 0");
                    num = Integer.valueOf(entrada.readLine());
                }
            } catch(Exception exc){
            System.out.println(exc);
        }
    }
}
