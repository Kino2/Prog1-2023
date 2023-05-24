/* 5) Escribir un programa que solicite una hora del día (valor entero de
la hora solamente) y resuelva en cada caso:
a. Si la hora está entre las 0 y las 5, pida ingresar la
temperatura y si la misma es menor a 20 grados imprima
“Encender la calefacción”. Si es mayor a 25, imprima
“Apagar calefacción”. Si está en el rango de 20 a 25 imprima
“Calefacción encendida, no abra las ventanas!!!”.
b. Si la hora está entre las 6 y las 11, pida un carácter letra
minúscula y si es vocal imprima por la consola la cantidad de
vocales que tiene la palabra que corresponde con la hora.
Ejemplo 8 (ocho) tiene 2 vocales. Si no es vocal imprima la
cantidad de consonantes que tiene, para el ejemplo 8 (ocho)
tiene 2 consonantes.
c. Si la hora está entre las 12 y 17 y es par, imprima el
promedio entre la hora ingresada y el límite inferior del
rango. Si la hora es impar debe imprimir el promedio entre la
hora ingresada y el límite superior del rango.
d. Si la hora está entre las 18 y 23, pida ingresar una clave
numérica, si coincide con la clave almacenada previamente
en una constante, pida ingresar una segunda clave de
verificación (un valor entre 100 y 999). Para esta segunda
clave (que solo la conoce el usuario) se debe verificar que el
el dígito de mayor peso (centena) es múltiplo del dígito de
mayor peso de la clave almacenada. Si todo esto se cumple
debería mostrar por la consola el mensaje “Clave correcta”.
Ejemplo: clave almacenada 364, clave ingresada 364,
segunda clave ingresada 698. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp2e5 {
    public static void main (String[]args){
        int hora, temp, claveIngresada, segClaveIngresada, digitoClaveGuardada, digitoClaveIngresada2;
        char letra;
        final int CLAVEGUARDADA = 400;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese la hora");
            hora = Integer.valueOf(entrada.readLine());
            if((hora >= 0)&&(hora <= 5)){
                System.out.println("Ingrese la temperatura");
                temp = Integer.valueOf(entrada.readLine());
                if(temp < 20){
                    System.out.println("Encender la calefaccion");
                } else if (temp > 25){
                    System.out.println("Apagar calefaccion");
                } else if ((temp >= 20)&&(temp<=25)){
                    System.out.println("Calefacción encendida, no abra las ventanas!!!");
                }
            } else if ((hora >= 6)&&(hora <= 11)){
                System.out.println("Ingrese un caracter letra minuscula");
                letra = entrada.readLine().charAt(0);
                if((letra == 'a')||(letra == 'e')||(letra == 'i')||(letra == 'o')||(letra == 'u')){
                    switch (hora){
                        case 6: System.out.println("Seis tiene dos vocales"); break;
                        case 7: System.out.println("Siete tiene tres vocales"); break;
                        case 8: System.out.println("Ocho tiene dos vocales"); break;
                        case 9: System.out.println("Nueve tiene tres vocales"); break;
                        case 10: System.out.println("Diez tiene dos vocales"); break;
                        case 11: System.out.println("Once tiene dos vocales"); break; 
                        default: System.out.println("Valor invalido");
                    }
                } else {
                    switch (hora){
                        case 6: System.out.println("Seis tiene dos consonantes"); break;
                        case 7: System.out.println("Siete tiene dos consonantes"); break;
                        case 8: System.out.println("Ocho tiene dos consonantes"); break;
                        case 9: System.out.println("Nueve tiene dos consonantes"); break;
                        case 10: System.out.println("Diez tiene dos consonantes"); break;
                        case 11: System.out.println("Once tiene dos consonantes"); break;
                        default: System.out.println("Valor invalido");
                    }
                }
            } else if ((hora >= 12)&&(hora <= 17)&&(hora % 2 == 0)){
                System.out.println ("El promedio es " + (hora + 12)/2);
            } else if ((hora >= 12)&&(hora <= 17)&&(hora % 2 != 0)){
                System.out.println ("El promedio es " + (hora + 17)/2);
            } else if ((hora >= 18)&&(hora <= 23)){
                System.out.println("Ingrese una clave");
                claveIngresada = Integer.valueOf(entrada.readLine());
                if(CLAVEGUARDADA == claveIngresada){
                    System.out.println("Ingrese una segunda clave de verificacion (entre 100 y 999)");
                    segClaveIngresada = Integer.valueOf(entrada.readLine());
                    if(segClaveIngresada >= 100 && segClaveIngresada <= 999){
                        digitoClaveGuardada = CLAVEGUARDADA / 100;
                        digitoClaveIngresada2 = segClaveIngresada / 100;
                        if(digitoClaveIngresada2 % digitoClaveGuardada == 0){
                            System.out.println("Clave correcta");
                        } else {
                            System.out.println ("Clave incorrecta");
                        }
                    } else {
                        System.out.println ("La clave no esta entre 100 y 999");
                    }
                } else {
                    System.out.println ("No coinciden las claves");
                }
            }
        } catch (Exception exc){
            System.out.println(exc);
        }
    }
    
}
