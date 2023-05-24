/* 6) Escribir un programa que mientras el usuario ingrese un número
entero menor que 100 y mayor a 1, muestre por pantalla si el
número es múltiplo de 2 y múltiplo de 3 simultáneamente. (¿Los
valores mencionados en el enunciado deberían ser constantes?.
De a poco habría que definirlos como constantes). */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2e6 {
    public static void main (String []args){
        int num;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero");
            num = Integer.valueOf(entrada.readLine());
            if (num > 1 && num < 100){
                if(num % 2 == 0 && num % 3 == 0){
                    System.out.println(num + " es multiplo de 2 y de 3");
                } else {
                    System.out.println(num + " no es multiplo de 2 y de 3");
                }
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
