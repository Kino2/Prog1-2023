/* 1) Escribir un programa completo (declaración de constantes y
variables, carga de datos, procesamiento e impresión de
resultados) para cada caso o ítem que:
a. solicite un número e indique si es positivo o negativo.
b. solicite un número e imprima “grande” si es mayor a 100 y
“chico “ si es menor.
c. solicite un número del 1 al 7 e imprima el día de la semana.
d. solicite una letra e imprima si es vocal o consonante.
e. solicite 3 números e imprima “creciente” si los tres números
están en orden creciente, “decreciente” si están en orden
decreciente o “error” si no cumplen ningún orden */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2e1 {
   public static void main (String[]args){
    int numPN, numGC, numDia, numOne, numTwo, numThree;
    char vocalCons;
    try{
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingresa un numero");
        numPN = Integer.valueOf(entrada.readLine());
        System.out.println("Ingrese otro numero");
        numGC = Integer.valueOf(entrada.readLine());
        System.out.println("Ingrese un numero de dia (entre 1 y 7)");
        numDia =  Integer.valueOf(entrada.readLine());
        System.out.println("Ingrese una letra");
        vocalCons = entrada.readLine().charAt(0);
        System.out.println("Ingresa un numero");
        numOne = Integer.valueOf(entrada.readLine());
        System.out.println("Ingresa el segundo numero");
        numTwo = Integer.valueOf(entrada.readLine());
        System.out.println("Ingresa el tercer numero");
        numThree = Integer.valueOf(entrada.readLine());
        if(numPN >= 0){
            System.out.println("El " + numPN + " es positivo");
        } else {
            System.out.println("El " + numPN + " es negativo");
        } if (numGC > 100){
            System.out.println("El " + numGC + " es grande");
        } else {
            System.out.println("El " + numGC + " es chico");
        } 
        switch (numDia){
            case 1: System.out.println("Es lunes"); break;
            case 2: System.out.println("Es martes"); break;
            case 3: System.out.println("Es miercoles"); break;
            case 4: System.out.println("Es jueves"); break;
            case 5: System.out.println("Es viernes"); break;
            case 6: System.out.println("Es sabado"); break;
            case 7: System.out.println("Es domingo"); break;
            default: System.out.println("No es un dia de la semana");
        }
        switch (vocalCons){
            case 'a': System.out.println("Es vocal"); break;
            case 'e': System.out.println("Es vocal"); break;
            case 'i': System.out.println("Es vocal"); break;
            case 'o': System.out.println("Es vocal"); break;
            case 'u': System.out.println("Es vocal"); break;
            default: System.out.println("Es consonante");
        } 
        if (numOne < numTwo && numTwo < numThree){
            System.out.println("Creciente");
        } else if (numOne > numTwo && numTwo > numThree){
            System.out.println("Decreciente");
        } else {
            System.out.println("Error");
        }
    } catch (Exception exc){
        System.out.println(exc);
    }
   }
}
