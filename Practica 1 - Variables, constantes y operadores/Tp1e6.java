/*Escribir un programa que pida se ingresen datos necesarios para
emitir una factura por la compra de dos artículos de librería (tipo
factura, número, nombre cliente, producto 1, importe 1, producto 2,
importe 2, importe total). Como salida debe imprimir por pantalla la
factura en un formato similar al del siguiente ejemplo:
Factura C N 249
Nombre: Juan Perez
Producto Importe
Lápiz 15.5
Papel 20.6
Importe total 36.1 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tp1e6 {
    public static void main(String[] args) {
        char typeBill;
        int numBill;
        String name, prod1, prod2;
        double amount1, amount2;
        try {
              BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
              System.out.println("Ingrese el tipo de factura");
              typeBill = entrada.readLine().charAt(0);
              System.out.println("Ingrese el numero de factura");
              numBill = Integer.valueOf(entrada.readLine());
              System.out.println("Ingrese el nombre del cliente");
              name = String.valueOf(entrada.readLine());
              System.out.println("Ingrese el primer producto");
              prod1 = String.valueOf(entrada.readLine());
              System.out.println("Ingrese el importe del primer producto");
              amount1 = Double.valueOf(entrada.readLine());
              System.out.println("Ingrese el segundo producto");
              prod2 = String.valueOf(entrada.readLine());
              System.out.println("Ingrese el importe del segundo producto");
              amount2 = Double.valueOf(entrada.readLine());

              System.out.println("Factura       " + typeBill + " N " + numBill);
              System.out.println("Nombre        " + name);
              System.out.println("Producto " + "     Importe");
              System.out.println(prod1 + "      " + amount1);
              System.out.println(prod2 + "     " + amount2);
              System.out.println("Importe total " + (amount1 + amount2));
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
