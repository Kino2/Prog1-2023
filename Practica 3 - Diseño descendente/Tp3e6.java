/* 6) Escribir un programa que mientras el usuario cargue desde
teclado un carácter letra minúscula, llame a un método que
imprime por pantalla la tabla de multiplicar del 9. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp3e6 {
    public static void main (String[]args){
        char caracter;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter letra minuscula");
            caracter = entrada.readLine().charAt(0);
            if(caracter >= 'a' && caracter <= 'z'){
                System.out.println("Tabla de multiplicar del 9");
                tabla_del_9();
            }
        } catch (Exception exc){
            System.out.println(exc);
        }
    }
    public static void tabla_del_9(){
        for (int i = 1; i <= 10; i++){
            System.out.println("9" + " x " + i + " = " + 9 * i);
        }
    }
}
