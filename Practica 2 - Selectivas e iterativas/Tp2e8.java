/* 8) Escribir un programa que mientras que el usuario ingrese un
carácter dígito o carácter letra minúscula, imprima si es carácter
dígito o carácter letra minúscula, y si es letra minúscula imprimir si
es vocal o consonante. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2e8 {
    public static void main (String []args){
        char caracter;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter (* para salir):");
            caracter = entrada.readLine().charAt(0);

            while (((caracter >= '0') && (caracter <= '9')) || ((caracter >= 'a') && (caracter <= 'z'))) {
                if ((caracter >= '0') && (caracter <= '9')) {
                    System.out.println("Es dígito.");
                }
                else if ((caracter >= 'a') && (caracter <= 'z')) {
                    switch (caracter) {
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u': {
                            System.out.println("Es una letra minúscula y es vocal.");
                            break;
                        }
                        default: {
                            System.out.println("Es una letra minúscula y es consonante.");
                        }
                    }
                }
                System.out.println("Ingrese un caracter:");
                caracter = entrada.readLine().charAt(0);
            }
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
