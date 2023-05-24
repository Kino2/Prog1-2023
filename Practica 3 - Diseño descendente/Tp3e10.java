/*Escribir un programa que mientras el usuario ingrese un
número entero entre 1 y 10 realice:
a. Si el numero ingresado es múltiplo de 3 pida ingresar un
caracter, y para el caracter ingresado imprima a qué tipo de
carácter está asociado:
i. “letra minúscula” si el caracter es una letra del
abecedario en minúscula;
ii. “letra mayúscula” si el caracter es una letra del
abecedario en mayúscula;
iii. “dígito” si el caracter corresponde a un número;
iv. “otro” para los restantes casos de caracteres.
b. Si el número ingresado es múltiplo de 5 imprima la tabla de
multiplicar del número ingresado. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp3e10 {
    public static void main(String[]args){
        int num;
        char caracter;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entero entre el 1 y el 10");
            num = Integer.valueOf(entrada.readLine());
            while(num >=1 && num <= 10){
                if(num % 3 == 0){
                    System.out.println("Ingrese un caracter");
                    caracter = entrada.readLine().charAt(0);
                    imprimir_segun_caracter(caracter);
                } else if(num % 5 == 0){
                    System.out.println("Tabla de multiplicar de " + num);
                    imprimir_tabla_multiplicar(num);
                }
                System.out.println("Ingrese un numero entero entre el 1 y el 10");
                num = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception exc){
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
    public static void imprimir_tabla_multiplicar(int num){
        for (int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}
        
