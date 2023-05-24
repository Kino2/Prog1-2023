/*Escribir un programa que simule 1000 lanzamientos de un dado
y muestre por pantalla cuántas veces salió el valor del dado
correspondiente al número entero N ingresado por el usuario.
Considerar que el valor N ingresado se corresponda a un valor
posible para un dado. Usar la sentencia Math.random() que
devuelve un valor aleatorio real entre 0 y 1.
Para asignar un posible valor a la variable dado entero:
dado = (int) (6*Math.random() + 1) */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp3e12 {
    public static void main(String[]args){
        int num;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un valor de un dado");
            num = Integer.valueOf(entrada.readLine());
            if(num >= 1 && num <= 6){
                num_repetido(num);
            }
        } catch (Exception exc){
            System.out.println(exc);
        }
    }
    public static void num_repetido(int num){
        int contador = 0, min = 1, max = 6;
        for(int i = 0; i <= 1000; i++){
         int numAleatorio = (int)(Math.random() * (max - min + 1)) + min;
         if(num == numAleatorio){
            contador++;
         }
        }
        System.out.println("El valor " + num + " salio " + contador + " veces.");
    }
}
