/* Se tiene un arreglo A de secuencias de enteros y un arreglo B de enteros ordenado ascendente. Cada secuencia de A tiene números primos (solo divisible por 1 y por sí mismo) 
o múltiplos de 5. 
Además se tiene el siguiente método pre-existente: _un método que permite obtener el índice inicial de la secuencia con menor cantidad de números múltiplos de un valor dado
 para un arreglo de secuencias.
Se pide realizar el programa y los métodos que permitan agregar en B (manteniendo su orden) los números primos de la secuencia de A con menor cantidad de números múltiplos de 5.
Observaciones: _los arreglos son de tamaño MAX y están precargados,
_las secuencias están separadas por uno o más ceros, empiezan y terminan con uno o más ceros,
_definir el encabezado del método pre-existente (no hay que implementarlo),
_no realizar métodos de carga e impresión de arreglos ni utilizar arreglos auxiliares.
 */
public class Parcial2 {
    static final int MAX = 10;
    static final int cte5 = 5;

    public static void main(String[] args) {
        int[] arrA = new int[MAX];
        int[] arrB = new int[MAX];
        arrA[0] = 0;
        arrA[1] = 5;
        arrA[2] = 7;
        arrA[3] = 1;
        arrA[4] = 2;
        arrA[5] = 10;
        arrA[6] = 0;
        arrA[7] = 2;
        arrA[8] = 3;
        arrA[9] = 0;
        arrB[0] = 1;
        arrB[1] = 2;
        arrB[2] = 3;
        arrB[3] = 4;
        arrB[4] = 5;
        arrB[5] = 6;
        arrB[6] = 7;
        arrB[7] = 8;
        arrB[8] = 9;
        arrB[9] = 10;
        int inicio = indice_inicial_sec_multiplos(arrA, cte5);
        int fin = indice_final_sec(arrA, inicio);
        System.out.println("Arreglo A");
        imprimirSecuencia(arrA);
        System.out.println("Arreglo B");
        imprimirSecuencia(arrB);
        agregar_primos_arreglo(arrA, arrB, inicio, fin);
        System.out.println("Arreglo B");
        imprimirSecuencia(arrB);
    }

    public static int indice_inicial_sec_multiplos(int[] arr, int valor) {
        return 1;// no es necesario poner valor
    }

    public static int indice_final_sec(int[] arr, int pos) {
        while ((pos < MAX) && (arr[pos] != 0)) {
            pos++;
        }
        return pos;
    }

    public static void corrimiento_der(int[] arr, int pos) {
        int i = MAX - 1;
        while (i > pos) {
            arr[i] = arr[i - 1];
            i--;
        }
    }

    public static int obt_pos_valor_ord(int[] arrB, int valor) {
        int pos = 0;
        while ((pos < MAX) && (arrB[pos] < valor)) {
            pos++;
        }
        return pos;
    }

    public static void agregar_primos_arreglo(int[] arrA, int[] arrB, int inicio, int fin) {
        int posicion;
        while (inicio < fin) {
            if ((arrA[inicio] % 5 != 0)&&(arrA[inicio]%2!=0)&&(arrA[inicio]%3!=0)) {
                posicion = obt_pos_valor_ord(arrB, arrA[inicio]);
                if (inicio < fin) {
                    corrimiento_der(arrB, posicion);
                    arrB[posicion] = arrA[inicio];
                }
            }
            inicio++;
        }
    }

    public static void imprimirSecuencia(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print(arr[pos] + "|");
        }
        System.out.print("\n");
    }
}