/* 4) Escribir un programa donde el usuario ingrese un número entre 0
y 999, y muestre un mensaje de cuántos dígitos tiene. Además, si
tiene 3 dígitos debe informar qué número es. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2e4 {
    public static void main (String[]args){
        int num;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entre 0 y 999");
            num = Integer.valueOf(entrada.readLine());
            if ((num < 0)||(num > 999)){
                System.out.println("No esta dentro del rango requerido");
            } else {
                int digitos = 0;
                int numeroTemporal = num;
                while(numeroTemporal != 0){
                    digitos++;
                    numeroTemporal /= 10;
                }
                System.out.println("El numero ingresado tiene " + digitos + " digitos.");
                if(digitos == 3){
                    System.out.println("El numero ingresado es " + num);
                }
            }
        } catch (Exception exc){
            System.out.println(exc);
        }
    }
}
