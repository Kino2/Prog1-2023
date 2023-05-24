/* 12) Escribir un programa que mientras el usuario ingrese un
carácter letra minúscula, se quede con la menor y la mayor letra
ingresada. Finalmente muestre por pantalla dichas letras. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2e12 {
    public static void main (String[]args){
        char letra, menor = 'z', mayor = 'a';
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter letra minuscula");
            letra = entrada.readLine().charAt(0);
            while (letra >= 'a' && letra <= 'z'){
                if(letra < menor){
                    menor = letra;
                }
                if(letra > mayor){
                    mayor = letra;
                }
                System.out.println("Ingrese un caracter letra minuscula");
                letra = entrada.readLine().charAt(0);
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
        System.out.println("La letra menor es: " +menor + " y la mayor es: " + mayor);
    }    
}
