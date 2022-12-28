//ORDENACIÓN POR INSERCIÓN
package EJERCICIO_07;

/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class OrdenacionInsercion {

    public static void main(String[] args) {
        int array[] = {9, 8, 7, 4, 3, 2, 1, 11, 23, 45, 32, 31};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        ordInsercion(array);
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void ordInsercion(int[] a) {
        int i, j;
        int aux;
        for (i = 1; i < a.length; i++) {
            /*	 indice j es para explorar la sublista a[i-1]..a[0] buscando la
	 	 posicion correcta del elemento destino*/
            j = i;
            aux = a[i];
            // se localiza el punto de inserción explorando hacia abajo
            while (j > 0 && aux < a[j - 1]) {
                // desplazar elementos hacia arriba para hacer espacio
                a[j] = a[j - 1];
                j--;
            }
            a[j] = aux;
        }
    }
}
