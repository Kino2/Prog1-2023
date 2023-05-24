/* 10) Escribir un programa que mientras que el usuario ingrese un
número entero entre 1 y 10 inclusive, lleve la suma de los
números ingresados. Finalmente, cuando sale del ciclo muestre
por pantalla el resultado de la suma. ¿En qué casos termina? */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2e10 {
    public static void main (String []args){
        int num, suma = 0;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entero distinto a 0");
            num = Integer.valueOf(entrada.readLine());
            while(num >=1 && num <= 10){
                    suma = suma + num;
                    System.out.println("Ingrese un numero entero distinto a 0");
                    num = Integer.valueOf(entrada.readLine());
        }
        } catch (Exception exc){
            System.out.println(exc);
        }
        System.out.println("La suma de los numeros ingresados es: " + suma);
    }
}
