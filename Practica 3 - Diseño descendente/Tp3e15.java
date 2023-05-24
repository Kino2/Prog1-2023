/*Escribir un programa que mientras que el usuario ingrese un
número entero natural, llame a un método que calcule la
sumatoria entre 1 y dicho número y se lo retorne como resultado. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp3e15 {
    public static void main (String [] args){
        int num, sumatoria;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entero");
            num = Integer.valueOf(entrada.readLine());
            sumatoria = sumatoria_entre1_num(num);
            System.out.println("El resultado de la sumatoria entre " + num + " y 1 es: " + sumatoria );
        } catch (Exception exc){
            System.out.println(exc);
        }
    }
    public static int sumatoria_entre1_num(int num){
        if(num == 1){
            return 1;
        } else {
            return num + sumatoria_entre1_num(num - 1);
        }
    }
}

/* si el usuario ingresa 5 como entrada para la función sumatoria, entonces la función se llama a sí misma con el argumento 4. Luego, la función se llama a sí misma con el argumento 3, luego con el argumento 2, luego con el argumento 1 */