/* 8) Realizar un programa que dado dos números enteros y un
carácter, todos ingresados por el usuario, muestre por pantalla el
resultado de la operación matemática básica considerando el valor
del carácter. Si ingreso el carácter: ‘a’ la suma, ‘b’ la resta, ‘c’ la
multiplicación y ‘d’ la división entre ambos números. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp3e8 {
    public static void main(String[]args){
        int num1, num2;
        char caracter;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entero");
            num1 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese otro numero entero");
            num2 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese un caracter");
            caracter = entrada.readLine().charAt(0);
            operaciones_segun_caracter(num1, num2, caracter);
        } catch (Exception exc){
            System.out.println(exc);
        }
    }    
    public static void operaciones_segun_caracter(int num1, int num2, char caracter){
        if(caracter == 'a'){
            System.out.println(num1 + num2);
        } else if(caracter == 'b'){
            System.out.println(num1 - num2);
        } else if(caracter == 'c'){
            System.out.println(num1 * num2);
        } else if(caracter == 'd'){
            System.out.println("La division entre " +num1+ " y " + num2 + " da = " + num1 / num2);
            System.out.println("La division entre " +num2+ " y " + num1 + " da = " + num2 / num1);
        } else {
            System.out.println("No se ha encontrado la operacion que se quiere hacer"); 
        }
    }
}
