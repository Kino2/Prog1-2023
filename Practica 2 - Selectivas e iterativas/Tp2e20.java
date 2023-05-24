/* 20) Pedir números enteros positivos por teclado. En cada iteración
el usuario puede ingresar 0 para salir del programa. Si ingresa un
número distinto de 0 se debe pedir el ingreso de un carácter.
a. Si es ‘a’ se debe permitir al usuario escribir un texto libre e
imprimirlo por pantalla.
b. Si es ‘b’ se deben pedir 5 números positivos e informar si
fueron ingresados en orden ascendente.
c. Si es ‘c’ se deben pedir dos números enteros negativos e
imprimir la raíz cuadrada de su multiplicación. La raíz
cuadrada de un número se calcula con la sentencia:
Math.sqrt(numero).
d. Ante cualquier otro carácter ingresado se debe informar un
error y pedir nuevamente el carácter. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2e20 {
    public static void main (String [] args){
        int num, numPos1,numPos2,numPos3,numPos4,numPos5, numNeg1, numNeg2;
        char caracter;
        String texto;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero");
            num = Integer.valueOf(entrada.readLine()); 
            while(num > 0){
                if(num != 0){
                    System.out.println("Ingrese un caracter a,b o c");
                    caracter = entrada.readLine().charAt(0);
                    if(caracter == 'a'){
                        System.out.println("Escriba un texto");
                        texto = String.valueOf(entrada.readLine());
                        System.out.println("El texto que escribio es: " + texto);
                    } else if (caracter == 'b'){
                        System.out.println("Ingrese 5 numeros positivos");
                        System.out.println("Ingrese el primer numero");
                        numPos1 = Integer.valueOf(entrada.readLine());
                        System.out.println("Ingrese el segundo numero");
                        numPos2 = Integer.valueOf(entrada.readLine());
                        System.out.println("Ingrese el tercer numero");
                        numPos3 = Integer.valueOf(entrada.readLine());
                        System.out.println("Ingrese el cuarto numero");
                        numPos4 = Integer.valueOf(entrada.readLine());
                        System.out.println("Ingrese el quinto numero");
                        numPos5 = Integer.valueOf(entrada.readLine());
                        if(numPos1 > 0 && numPos2 > 0 && numPos3 > 0 && numPos4 > 0 && numPos5 > 0){
                            if(numPos1 < numPos2 && numPos2 < numPos3 && numPos3 < numPos4 && numPos4 <numPos5){
                                System.out.println("Los numeros fueron ingresados de forma ascendente");
                            } else {
                                System.out.println("Los numeros no fueron ingresados de forma ascendente");
                            }
                        }
                    } else if (caracter == 'c'){
                        System.out.println("Ingrese 2 numeros negativos");
                        System.out.println("Ingrese el primer numero");
                        numNeg1 = Integer.valueOf(entrada.readLine());
                        System.out.println("Ingrese el segundo numero");
                        numNeg2 = Integer.valueOf(entrada.readLine());
                        if(numNeg1 < 0 && numNeg2 < 0){
                            System.out.println("La raiz cuadrada de la multiplicacion es: " + Math.sqrt(numNeg1 * numNeg2));
                        }
                    } else {
                        System.out.println("No cumple con las condiciones pedidas");
                    }
                    }
                System.out.println("Ingrese un numero");
                num = Integer.valueOf(entrada.readLine()); 
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }    
}
