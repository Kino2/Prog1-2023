/* 16) Pedir por consola 15 caracteres. Imprimir la mayor cantidad de
‘a’ seguidas que se ingresaron. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2e16 {
    public static void main (String[]args){
        char caracter;
        int a_seguidas = 0, cantA = 0;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            for(int i = 0; i <= 15; i++){
                System.out.println("Ingrese un caracter letra minuscula");
                caracter = entrada.readLine().charAt(0);
                if(caracter == 'a' || caracter == 'A'){
                    cantA++;
                }
                if(cantA > a_seguidas){
                    a_seguidas = cantA;
                    cantA = 0;
                }
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
        System.out.println("La mayor cantidad de a seguidas que se ingresaron es: " +a_seguidas);
    }
}
