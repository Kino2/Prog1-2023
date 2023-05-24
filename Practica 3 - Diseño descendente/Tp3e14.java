/*Escribir un programa que mientras el usuario ingresa un
carácter distinto del carácter ‘*’, invoque a un método que imprima
si es carácter dígito o carácter letra minúscula, y si es letra
minúscula imprimir si es vocal o consonante. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp3e14 {
    public static void main (String [] args){
        char caracter;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter distinto a *");
            caracter = entrada.readLine().charAt(0);
            while(caracter != '*'){
                tipo_de_caracter(caracter);
                System.out.println("Ingrese un caracter distinto a *");
                caracter = entrada.readLine().charAt(0);
            }
        } catch (Exception exc){
            System.out.println(exc);
        }
    }
    public static void tipo_de_caracter(char caracter){
        if(caracter != '*'){
            switch (caracter){
                case '0': case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9': {
                    System.out.println("Es caracter digito");
                    break;
                }
                case 'a': case 'e': case 'i': case 'o': case 'u': {
                    System.out.println("Es caracter vocal minuscula");
                    break;
                }
                default: System.out.println("No es digito ni vocal minuscula");
        }
    }
  }
}