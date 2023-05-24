/*Suponer a partir de lo resuelto en el ejercicio anterior (11) que
el elemento a eliminar coincide con el último que hay en el arreglo.
¿Qué pasa en este caso? ¿Cómo daría una solución al problema? */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Tp5e12 {
    static final int MAX = 10;
    static final int MAXVALOR = 10;
    static final int MINVALOR = 1;

    public static void main(String[] args) {
        int[] arreglo = new int[MAX];
        int numero, pos;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            cargarArreglo(arreglo);
            imprimirArreglo(arreglo);
            System.out.println("Ingrese un número");
            numero = Integer.parseInt(entrada.readLine());
            eliminarOcurrencias(arreglo, numero);
            imprimirArreglo(arreglo);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void eliminarOcurrencias(int[] arreglo, int numero) {
        int i = 0;
        int j = 0;
        while (i < MAX) {
            if (arreglo[i] != numero) {
                arreglo[j] = arreglo[i];
                j++;
            }
            i++;
        }
        while (j < MAX) {
            arreglo[j] = 0; // Otra opción es asignar un valor específico o -1 si se desea marcar como eliminado
            j++;
        }
    }

    public static void cargarArreglo(int[] arreglo) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arreglo[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
        }
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print("[" + arreglo[pos] + "]");
        }
        System.out.println("");
    }
}

/*utilizamos dos índices, i y j. El índice i recorre el arreglo original, mientras que el índice j apunta a la posición donde se deben guardar los elementos no eliminados. Si el elemento en la posición i no es igual al número deseado, se guarda en la posición j y se incrementa j. Al finalizar el recorrido, asignamos el valor 0 a todas las posiciones restantes a partir de j.

Espero que esta versión corregida cumpla con tus requisitos. Si tienes alguna otra pregunta o problema, estaré encantado de ayudarte. */