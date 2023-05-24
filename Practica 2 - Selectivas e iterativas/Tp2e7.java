/* 7) Escribir un programa que mientras el usuario ingresa un caracter
distinto del carácter ‘*’, muestre por pantalla si es carácter dígito, o
si es carácter vocal minúscula. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2e7 {
    public static void main (String [] args){
        char caracUser;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter distinto a *");
            caracUser = entrada.readLine().charAt(0);
            if(caracUser != '*'){
                switch (caracUser){
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
        } else {
            System.out.println("No se puede ingresar el caracter *");
        }
    } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}