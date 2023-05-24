/*Escribir un programa que mientras que el usuario ingrese un
carácter letra minúscula, pida ingresar un número entero. Si el
número ingresado está entre 1 y 5 inclusive deberá imprimir la
tabla de multiplicar de dicho número. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp3e17 {
    public static void main (String[]args){
        char letra;
        int num;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese una letra minuscula");
            letra = entrada.readLine().charAt(0);
            while(letra >= 'a' && letra <= 'z'){
                System.out.println("Ingrese un numero entero entre 1 y 5");
                num = Integer.valueOf(entrada.readLine());
                tabla_mult_num(num);
                System.out.println("Ingrese una letra minuscula");
                letra = entrada.readLine().charAt(0);
            }
        } catch (Exception exc) {
           System.out.println(exc);
        }
    }
    public static void tabla_mult_num(int num){
        if(num >= 1 && num <= 5){
            System.out.println("Tabla de multiplicar de " + num);
            for(int i = 1; i <= 10; i++){
                System.out.println(num + " x " + i + " = " + num * i);
            }
        } else {
            System.out.println("Ingresaste un numero que no está entre 1 y 5");
        }
    }
}
