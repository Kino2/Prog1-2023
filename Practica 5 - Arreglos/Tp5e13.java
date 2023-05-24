/*Hacer un programa que inserte un elemento en un arreglo
(ordenado decrecientemente) de tamaño MAX=10. */


import java.util.Random;;
public class Tp5e13 {
    static final int MAX = 10;
    static final int MAXVALOR = 10;
    static final int MINVALOR = 1;    public static void main(String[] args) {
        int[] arr = new int[MAX];
        int pos = 7;
        int num = 5;
        cargarArreglo(arr);
        imprimirArreglo(arr);
        colocarNum(arr, pos, num);
        imprimirArreglo(arr);
    }
    public static void colocarNum(int[]arr, int pos, int num){
        corrimientoDer(arr, pos);
        arr[pos] = num;
    }
    public static void corrimientoDer(int [ ] arr, int pos) {
        for(int i = pos; i < MAX - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }

    public static void cargarArreglo(int[] arr) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
        }
        ordenarArreglo(arr);
    }

    public static void ordenarArreglo(int[] arr) {
        int posMayor, temp;
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            posMayor = i;
            
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[posMayor]) { // Cambio de < a >
                    posMayor = j;
                }
            }
            
            if (posMayor != i) {
                temp = arr[i];
                arr[i] = arr[posMayor];
                arr[posMayor] = temp;
            }
        }
    }
    

    public static void imprimirArreglo(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print("[" + arr[pos] + "]");
        }
        System.out.println("");
    }
}
