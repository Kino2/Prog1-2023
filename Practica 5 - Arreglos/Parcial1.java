/*Tema 1: Se tiene un arreglo A de enteros ordenado ascendente, y un arreglo B de secuencias de enteros donde cada secuencia tiene multiplos de 2 o multiplos de 3 o numeros primos 
(solo divisible por 1 y por si mismo). 
Ademas se tiene el siguiente metodo pre-existente: _un metodo que permite obtener el indice final de la secuencia con mayor cantidad de numeros primos de un arreglo de secuencias.
Se pide realizar el programa y los metodos que permitan eliminar de A los numeros primos de la secuencia de B con mayor cantidad de numeros primos.
Observaciones: _los arreglos son de tamaño MAX y estan precargados,
_las secuencias estan separadas por uno o mas ceros, empiezan y terminan con uno o mas ceros,
_definir el encabezado del metodo pre-existente (no hay que implementarlo),
_no realizar metodos de carga e impresion de arreglos ni utilizar arreglos auxiliares. */

public class Parcial1 {
    static final int MAX = 10;
    static final int MAXVALOR = 10;
    static final int MINVALOR = 1;
    static final int cte2 = 2;
    static final int cte3 = 3;

    public static void main (String [] args){
        int [] arrA = new int [MAX];
        int [] arrB = new int [MAX];
        arrA[0] = 0; arrA[1]=1;arrA[2]=2;arrA[3]=3;arrA[4]=7;arrA[5]=7;arrA[6]=7;arrA[7]=7;arrA[8]=7;arrA[9]=7;
        arrB[0] = 0; arrB[1]=2;arrB[2]=4;arrB[3]=0;arrB[4]=1;arrB[5]=5;arrB[6]=5;arrB[7]=7;arrB[8]=2;arrB[9]=0;
        int fin = obtener_fin_arrPrimos(arrB);
        int inicio = obtener_inicio_arrPrimos(arrA, fin);
        System.out.println("Arreglo A");
        imprimirSecuencia(arrA);
        System.out.println("Arreglo B");
        imprimirSecuencia(arrB);
        eliminar_primos_arreglo(arrA, arrB, inicio, fin);
        System.out.println("Arreglo A modificado");
        imprimirSecuencia(arrA);
    }
    public static int obtener_fin_arrPrimos(int [] arrB){
        return 9;
    }
    public static int obtener_inicio_arrPrimos(int[]arrB, int pos){
        while((pos>0)&&(arrB[pos]!=0)){
            pos--;
        }
        return pos + 1;
    }

    public static void eliminar_primos_arreglo(int [] arrA, int []arrB, int inicio, int fin){
        for(int pos = 0; pos < MAX; pos++){
            if((arrA[pos]%cte2 != 0) && (arrA[pos] % cte3 != 0) &&(arrA[pos]!= 1)){
                if(existe_en_arreglo(arrA[pos], arrB,inicio, fin )){
                    corrimientoIzq(arrA, pos);
                    pos--;
                }
            }
        }
    }
    public static void corrimientoIzq(int[] arr, int pos){
    	while (pos<MAX-1){
    		arr[pos] = arr[pos+1];
    		pos++;
    	}
        arr[pos] = 0;
    }
    public static boolean existe_en_arreglo(int num, int []arrB, int inicio, int fin){
        while (inicio <= fin){
            if(arrB[inicio]==num){
                return true;
            }
            inicio++;
        }
        return false;
     }
     public static void imprimirSecuencia(int [] arr) {
        for(int pos=0;pos<MAX;pos++){
            System.out.print(arr[pos]+"|");
        }
        System.out.print("\n");
    }
}
