/*Hacer un programa que reemplace de un arreglo A todas las
ocurrencias de una secuencia patrón dada en un arreglo P, por la
secuencia contenida en el arreglo R de igual tamaño. */

public class Tp5e22 {
    static final int MAX = 15;
    static final int TAMANIOSECUENCIA = 4;

    public static void main (String [] args){
        int arrA [] = new int [MAX];
        int arrP [] = new int [MAX];
        int arrR [] = new int [MAX];
        arrA[0]= 0;arrA[1]= 1;arrA[2]= 2;arrA[3]= 3;arrA[4]= 7;arrA[5]= 0;arrA[6]= 0;arrA[7]= 1;arrA[8]= 2;arrA[9]= 3;arrA[10]= 7;arrA[11]= 0;arrA[12]= 2;arrA[13]= 1;arrA[14]= 0;
        arrP[0]= 0;arrP[1]= 1;arrP[2]= 2;arrP[3]= 3;arrP[4]= 7;arrP[5]= 0;arrP[6]= 0;arrP[7]= 0;arrP[8]= 0;arrP[9]= 9;arrP[10]= 1;arrP[11]= 3;arrP[12]= 2;arrP[13]= 1;arrP[14]= 0;
        arrR[0]= 0;arrR[1]= 9;arrR[2]= 12;arrR[3]= 20;arrR[4]= 18;arrR[5]= 0;arrR[6]= 0 ;arrR[7]= 0;arrR[8]= 0;arrR[9]= 0;arrR[10]= 0;arrR[11]= 0;arrR[12]= 0;arrR[13]= 0;arrR[14]= 0;
        System.out.println("Arreglo A");
        imprimirSecuencia(arrA);
        System.out.println("Arreglo P");
        imprimirSecuencia(arrP);
        System.out.println("Arreglo R");
        imprimirSecuencia(arrR);
        System.out.println("Arreglo A modificado");
        reemplazarSecPatron(arrA, arrP, arrR);
        imprimirSecuencia(arrA);
    }

    public static void reemplazarSecPatron(int [] arrA, int [] arrP, int [] arrR){
        int fin = -1;
        int inicio = obtenerInicio(arrA, fin + 1 );
        while(inicio < MAX - 1){
            fin = obtenerFin(arrA, inicio);
            if(son_iguales(arrA, arrP, inicio, fin)){
                reemplazarSec(arrA, arrR, inicio, fin);
            }
            inicio = obtenerInicio(arrA, fin + 1);
        }
    }
    
    public static boolean son_iguales(int [] arrA, int [] arrP, int inicio, int fin){
        int pos = 1;
        int tamanioSec = fin - inicio + 1;
        while(inicio <= fin){
            if((arrA[inicio] == arrP[pos]) && (tamanioSec == TAMANIOSECUENCIA)){
                inicio++;
                pos++;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void reemplazarSec(int [] arrA, int [] arrR, int inicio, int fin){
        int pos = 1;
        int tamanioSec = fin - inicio + 1;
        while(inicio <= fin){
            if(tamanioSec == TAMANIOSECUENCIA){
                arrA[inicio] = arrR[pos];
                inicio ++;
                pos++;
            }
        }
    }
    public static int obtenerInicio(int [] arrA, int pos){
        while((pos < MAX)&&(arrA[pos]== 0)){
            pos++;
        }
        return pos;
    }

    public static int obtenerFin(int [] arrA, int pos){
        while((pos < MAX) && (arrA[pos] != 0)){
            pos++;
        }
        return pos - 1;
    }
    public static void imprimirSecuencia(int [] arr) {
        for(int pos=0;pos<MAX;pos++){
            System.out.print(arr[pos]+"|");
        }
        System.out.print("\n");
    }
}
