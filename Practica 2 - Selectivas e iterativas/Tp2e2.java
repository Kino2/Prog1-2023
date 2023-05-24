/* 2) Construir un programa que solicite desde teclado un número de
mes y posteriormente notifique por pantalla la cantidad de días de
ese mes. En el caso de que ingrese 2 como número de mes
(febrero) deberá además solicitar ingresar un número de año, y
dependiendo si es bisiesto o no con la siguiente sentencia:
((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
imprimir la cantidad de días correspondiente. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2e2 {
    public static void main (String [] args){
        int mes, anio;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero");
            mes = Integer.valueOf(entrada.readLine());
            switch(mes){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12: {
                    System.out.println("Tiene 31 dias");
                    break;
                }
                case 4: case 6: case 9: case 11: {
                    System.out.println("Tiene 30 dias");
                    break;
                }
                case 2: {
                    System.out.println("Ingrese el anio");
                    anio = Integer.valueOf(entrada.readLine());
                    if((anio % 4 == 0) && ((anio % 100 != 0) || anio % 400 == 0)){
                        System.out.println("El febrero ingresado tiene 29 dias");
                    } else {
                        System.out.println("El febrero ingresado tiene 28 dias");
                    }
                    break;
                }
            }
        } catch (Exception exc){
            System.out.println(exc);
        }
    }
}
