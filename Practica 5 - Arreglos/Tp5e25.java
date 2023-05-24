/*Hacer un programa que dado el arreglo definido y precargado,
y un número entero ingresado por el usuario, copie de forma
continua las secuencias de tamaño igual al número ingresado en
otro arreglo de iguales características e inicializado con 0. La
copia en este último arreglo deben comenzar desde el principio
del mismo. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Tp5e25 {
    static final int MAX = 20;
    static final int MAXVALOR = 9;
    static final int MINVALOR = 1;
    static final double PROBABILIDAD = 0.4;
    public static void main (String [] args){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int [] arrA = new int [MAX];
        int [] arrB = new int [MAX];
        arrB[0]= 0;arrB[1]= 0;arrB[2]= 0;arrB[3]= 0;arrB[4]= 0;arrB[5]= 0;arrB[6]= 0;arrB[7]= 0;arrB[8]= 0;arrB[9]= 0;arrB[10]= 0;arrB[11]= 0;arrB[12]= 0;arrB[13]= 0;arrB[14]= 0;arrB[15]= 0;arrB[16]= 0;arrB[17]= 0;arrB[18]= 0;arrB[19]= 0;
        int num;
        try{
            cargarSecuencias(arrA);
            imprimirSecuencia(arrA);
            imprimirSecuencia(arrB);
            System.out.println("Ingrese un numero");
            num = Integer.valueOf(entrada.readLine());
            copiarSecuenciadeTamañoNum(arrA, arrB, num);
            imprimirSecuencia(arrB);
        } catch (Exception exc){
            System.out.println(exc);
        }
    }

    public static void copiarSecuenciadeTamañoNum(int [] arrA, int [] arrB, int num){
        int fin = -1;
        int inicio = obtenerInicioSec(arrA, fin + 1);
        int tam = 0;
        while(inicio < MAX - 1){
            fin = obtenerFinSec(arrA, inicio);
            tam = fin - inicio + 1;
            if(tam == num){
                copiar_y_reemplazar_en_arreglo(arrA, arrB, inicio, fin);
            }
            inicio = obtenerInicioSec(arrA, fin + 1);
        }
    }
    public static void copiar_y_reemplazar_en_arreglo(int []arrA, int [] arrB, int inicio, int fin){
        int pos= obtenerPosLibre(arrB);
        while(inicio <= fin){
            arrB[pos] = arrA[inicio];
            inicio++;
            pos++;
        }
    }
    public static int obtenerPosLibre(int [] arrB){
        int pos = 1;
        while (pos < MAX && arrB[pos] != 0) {
            pos++;
        }
        return pos;
    }
    public static int obtenerInicioSec(int[] arr, int pos) {
        while ((pos < MAX) && (arr[pos] == 0)) {
            pos++;
        }
        return pos;
    }

    public static int obtenerFinSec(int[] arr, int pos) {
        while ((pos < MAX) && (arr[pos] != 0)) {
            pos++;
        }
        return pos - 1;
    }
    public static void cargarSecuencias(int[] arr) {
        Random r = new Random();
        arr[0] = 0;
        arr[MAX - 1] = 0;
        for (int pos = 1; pos < MAX - 1; pos++) {
            if (r.nextDouble() > PROBABILIDAD) {
                arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
            } else {
                arr[pos] = 0;
            }
        }
    }

    public static void imprimirSecuencia(int [] arr) {
        for(int pos=0;pos<MAX;pos++){
            System.out.print(arr[pos]+"|");
        }
        System.out.print("\n");
    }
}
