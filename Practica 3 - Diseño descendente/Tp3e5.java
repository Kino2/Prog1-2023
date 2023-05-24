/*Hacer un método que dado un número entero con valor inicial 1,
haga una iteración incrementando el número de a uno hasta un
valor MAX = 4 (constante). Mientras itera deberá imprimir el
número. Luego invocarlo desde el programa principal y cuando
termina imprimir por pantalla “terminó”. */

public class Tp3e5 {
    public static void main (String []args){
        final int MAX = 4;
        int num = 1;
        itera_e_imprime(MAX, num);
        System.out.println("Terminó");
    }
    public static void itera_e_imprime(final int MAX, int num){
        while(num <= MAX){
            System.out.println(num);
            num++;
        }
    }
}
        
