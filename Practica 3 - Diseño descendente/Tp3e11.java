/*Escribir un método que retorne el mayor de dos números. Usar
ese método para calcular el máximo de una serie de números
ingresados por el usuario (20 números en total). */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp3e11 {
    public static final int MAX = 20;
	public static void main(String[] args) {
		int numero;
		int mayor = 0;
		try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Tiene que ingresar 20 numeros:");
			for(int i = 1; i<=MAX; i++){
				System.out.println("Ingrese numero");
				numero = Integer.valueOf(entrada.readLine());
				mayor = mayor_de_2_numeros(numero,mayor);
			}
			System.out.println("El numero mayor ingresado es: " + mayor);
		}
		catch(Exception Exc){
			System.out.println(Exc);
		}
	}

	public static int mayor_de_2_numeros(int numero1, int numero2){
		int mayor = 0;
		if(numero1>numero2){
			mayor = numero1;
		}
		else if(numero2>numero1){
			mayor = numero2;
		}
		else{
			mayor = numero1;
		}
		return mayor;
	}

}
