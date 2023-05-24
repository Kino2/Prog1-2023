/* 13) Escribir un programa que mientras que el usuario ingrese un
caracter letra minúscula, pida ingresar un número entero. Si el
número ingresado está entre 1 y 5 inclusive deberá imprimir la
tabla de multiplicar de dicho número. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2e13 {
    public static void main (String []args){
        char letra;
        int num;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter letra minuscula");
            letra = entrada.readLine().charAt(0);
            while (letra >= 'a' && letra <= 'z'){
                System.out.println("Ingrese un numero entero");
                num = Integer.valueOf(entrada.readLine());
                if(num >= 1 && num <= 5){
                    for(int i = 1; i <= 10; i++){
                        System.out.println(num + " x " + i + " = " + num * i);
                    }
                }
                System.out.println("Ingrese un caracter letra minuscula");
                letra = entrada.readLine().charAt(0);
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
