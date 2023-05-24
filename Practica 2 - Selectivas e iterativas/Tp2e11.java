/* 11) Escribir un programa que mientras el usuario ingrese un
caracter letra minúscula, acumule la cantidad de vocales que
ingresó. Finalmente muestre por pantalla dicha cantidad. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2e11 {
    public static void main (String[]args){
        char letra;
        int vocal = 0;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter letra minuscula");
            letra = entrada.readLine().charAt(0);
            while(letra >= 'a' && letra <= 'z'){
                switch (letra){
                    case 'a': vocal++; break;
                    case 'e': vocal++; break;
                    case 'i': vocal++; break;
                    case 'o': vocal++; break;
                    case 'u': vocal++; break;
                }
                System.out.println("Ingrese un caracter letra minuscula");
                letra = entrada.readLine().charAt(0);
            }
        } catch (Exception exc){
            System.out.println(exc);
        }
        System.out.println("La cantidad de vocales ingresadas es: " + vocal);
    }
}
