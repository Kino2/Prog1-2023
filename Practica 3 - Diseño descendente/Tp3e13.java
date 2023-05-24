/*Realizar un programa que, dada una opción entera (1,2,3,4),
permita realizar operaciones entre tres números reales (r1,r2,r3)
ingresados desde teclado. Para la opción:
1. Calcular la raíz cuadrada de (r1-r3)
2. Calcular el promedio de r1, r2 y r3
3. Calcular cociente de la raíz cuadrada de (r3 - r2) dividida por
r1
4. Calcular el cociente del promedio de los tres valores dividido
por la raíz cuadrada de r2
Observación: La raíz cuadrada de un número se calcula con la
sentencia: Math.sqrt(numero). Hacer uso del diseño descendente
y de la modularización para la solución. Tener en cuenta posibles
errores o excepciones como la división por cero. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp3e13 {
    public static void main (String [] args){
        double  r1, r2, r3;
        int numOp;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese el primer numero real");
            r1 = Double.valueOf(entrada.readLine());
            System.out.println("Ingrese el segundo numero real");
            r2 = Double.valueOf(entrada.readLine());
            System.out.println("Ingrese el tercer numero real");
            r3 = Double.valueOf(entrada.readLine());
            System.out.println("Ingrese la operacion (1,2,3 o 4)");
            numOp = Integer.valueOf(entrada.readLine());
            if(numOp >= 1 && numOp <= 4){
                hacer_operaciones(r1, r2, r3, numOp);
            } else {
                System.out.println("Ingresaste una operacion incorrecta");
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
    public static void hacer_operaciones(double r1, double r2, double r3, int numOp){
        double raizCuadrada, promedio, cocienteRaiz, cocientePromedio;
        if(numOp == 1){
            raizCuadrada = Math.sqrt(r1 - r3);
            System.out.println("La raiz cuadrada de " + (r1 - r3) + " es: " + raizCuadrada);
        } else if (numOp == 2){
            promedio = (r1 + r2+ r3)/3;
            System.out.println("El promedio de " + r1 + ", " + r2 + " y " + r3 + " es " + promedio);
        } else if (numOp == 3){
            raizCuadrada = Math.sqrt(r3-r2);
            if(r1 != 0){
            cocienteRaiz = raizCuadrada / r1;
            System.out.println("El cociente de la raiz cuadrada de " + (r3 - r2) + " dividido " + r1 + " es: " + cocienteRaiz);
            } else {
                System.out.println("No se puede dividir por 0");
            }
        } else if (numOp == 4){
            promedio = (r1 + r2 + r3)/3;
            raizCuadrada = Math.sqrt(r2);
            cocientePromedio = promedio / raizCuadrada;
            System.out.println("El cociente del promedio de los 3 reales dividido la raiz cuadrada de " + r2 + " es " + cocientePromedio);
        }
    }
}

