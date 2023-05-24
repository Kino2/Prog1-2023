/* 15) Pedir por consola el ingreso de números enteros. Cuando se
ingrese un 0 se debe terminar el programa informando el
promedio de los números ingresados, cuál fue el mayor número y
cuál fue el menor número. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2e15 {
    public static void main (String []args){
        int num, suma = 0, cantNum = 0, mayor = 0, menor = 1000000000;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entero");
            num = Integer.valueOf(entrada.readLine());
            while (num != 0){
                suma = suma + num;
                cantNum++;
                if(num > mayor){
                    mayor = num;
                }
                if(num < menor){
                    menor = num;
                }
                System.out.println("Ingrese un numero entero");
                num = Integer.valueOf(entrada.readLine());
            }
         } catch (Exception exc) {
            System.out.println(exc);
        }
        System.out.println("El promedio de los numeros ingresados es: " + suma/cantNum + ", el numero menor es: " +menor+ " y el mayor: " +mayor);
  }
}