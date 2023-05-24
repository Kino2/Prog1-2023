/* 9) Escribir un programa que mientras el usuario ingrese un número
entero entre 1 y 10, pida ingresar un carácter, y por cada carácter
ingresado imprima:
a. “letra minúscula” si el carácter es una letra del abecedario en
minúscula;
b. “letra mayúscula” si el carácter es una letra del abecedario en mayúscula;
c. “dígito” si el caracter corresponde a un número;
d. “otro” para los restantes casos de caracteres. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp3e9 {
    public static void main(String[]args){
        int num;
        char caracter;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero");
            num = Integer.valueOf(entrada.readLine());
            while (num >= 1 && num <= 10){
                System.out.println("Ingrese un caracter");
                caracter = entrada.readLine().charAt(0);
                imprimir_segun_caracter(caracter);
                System.out.println("Ingrese un numero");
                num = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
    public static void imprimir_segun_caracter(char caracter){
        if(caracter >= 'a' && caracter <= 'z'){
            System.out.println("Letra minuscula");
        } else if(caracter >= 'A' && caracter <= 'Z'){
            System.out.println("Letra mayuscula");
        } else if (caracter >= '0' && caracter <= '9'){
            System.out.println("Digito");
        } else {
            System.out.println("Otro");
        }
    }
}
