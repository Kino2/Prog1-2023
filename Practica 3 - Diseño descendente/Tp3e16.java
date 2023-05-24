/*Escribir un programa que mientras el usuario ingresa un
número de mes (entero) entre 1 y 12 inclusive, muestre por
pantalla la cantidad de días del mes ingresado (suponer febrero
de 28 días) (Mostrar por pantalla la cantidad de días del mes
debería realizarse con un método). */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp3e16 {
    public static void main (String []args){
        int mes;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un mes");
            mes = Integer.valueOf(entrada.readLine());
            while(mes >=1 && mes <=12){
                dias_del_mes(mes);
                System.out.println("Ingrese un mes");
                mes = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception exc) {
           System.out.println(exc);
        }
    }
    public static void dias_del_mes(int mes){
        switch (mes){
            case 1: System.out.println("Enero tiene 31 dias"); break;
            case 2: System.out.println("Febrero tiene 28 dias"); break;
            case 3: System.out.println("Marzo tiene 31 dias"); break;
            case 4: System.out.println("Abril tiene 30 dias"); break;
            case 5: System.out.println("Mayo tiene 31 dias"); break;
            case 6: System.out.println("Junio tiene 30 dias"); break;
            case 7: System.out.println("Julio tiene 31 dias"); break;
            case 8: System.out.println("Agosto tiene 31 dias"); break;
            case 9: System.out.println("Septiembre tiene 30 dias"); break;
            case 10: System.out.println("Octubre tiene 31 dias"); break;
            case 11: System.out.println("Noviembre tiene 30 dias"); break;
            case 12: System.out.println("Diciembre tiene 31 dias"); break;
        }
    }
}
