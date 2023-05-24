/*Escribir un programa que solicite nombre, edad, altura y ocupación, y
los imprima por pantalla. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp1e5 {
    public static void main (String []args){
        String nombre, ocupacion;
        int edad;
        double altura; 
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escriba su nombre");
            nombre = String.valueOf(entrada.readLine());
            System.out.println("Escriba su edad");
            edad = Integer.valueOf(entrada.readLine());
            System.out.println("Escriba su altura");
            altura = Double.valueOf(entrada.readLine());
            System.out.println("Escriba su ocupacion");
            ocupacion = String.valueOf(entrada.readLine());
            System.out.println("Nombre: " + nombre + " Edad: " + edad + " Altura: " + altura + " Ocupacion: " + ocupacion);
        } 
        catch (Exception exc){
            System.out.println(exc);
        }
    }
}
