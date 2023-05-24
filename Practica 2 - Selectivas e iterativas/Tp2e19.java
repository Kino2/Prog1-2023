/* 19) Construir un programa que solicite desde teclado un número de
mes válido y posteriormente notifique por pantalla la cantidad de
días de ese mes. En el caso de que ingrese 2 como número de
mes (febrero) deberá además solicitar ingresar un número de año
entre 2000 y 2019 inclusive (no debe seguir si no está en ese
rango), y dependiendo de si es bisiesto o no imprimir la cantidad
de días correspondiente. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2e19 {
    public static void main (String[]args){
        int mes, anio;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un mes");
            mes = Integer.valueOf(entrada.readLine());
            while(mes >= 1 && mes <=12){
                switch(mes){
                    case 1: System.out.println("Enero tiene 31 dias"); break;
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
                if(mes == 2){
                    System.out.println("Ingrese un anio entre 2000 y 2019");
                    anio = Integer.valueOf(entrada.readLine());
                    if(anio >= 2000 && anio <= 2019){
                        if(anio % 4 == 0){
                            System.out.println("Febrero tiene 29 dias");
                        } else {
                            System.out.println("Febrero tiene 28 dias");
                        }
                    }
                }
                System.out.println("Ingrese un mes");
                mes = Integer.valueOf(entrada.readLine());
            }

        } catch (Exception exc){
            System.out.println(exc);
        }
    }
}
