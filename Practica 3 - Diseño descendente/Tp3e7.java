/* 7) Escribir un programa que mientras el usuario cargue desde
teclado un número entero distinto de 0, imprima por pantalla la
suma que se obtiene de invocar un método que calcula la
sumatoria de los primeros 200 números naturales (son números
enteros entre 1 y 200). */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp3e7 {
    public static void main (String[]args){
        int num;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entero distinto a 0");
            num = Integer.valueOf(entrada.readLine());
            while(num!=0){
                if(num != 0){
                    suma_sumatoria_primeros_200_naturales();
                }
                System.out.println("Ingrese un numero entero distinto a 0 (0 para salir)");
                num = Integer.valueOf(entrada.readLine());
            }
            
        } catch (Exception exc) {
           System.out.println(exc);
        }
    }
    public static void suma_sumatoria_primeros_200_naturales(){
        final int MIN = 1, MAX = 200;
        int suma = 0;
        for(int num = MIN; num <= MAX; num++){
            suma += num;
            System.out.println("La sumatoria de 1 a 200 es: " + suma);
        }
    }
}
