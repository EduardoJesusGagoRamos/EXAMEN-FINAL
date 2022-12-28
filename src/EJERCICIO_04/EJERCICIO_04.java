/*
 4. Crear una aplicación para devolver un listado de nombre de cantantes. Se creará una clase para el cantante 
    y otra para guardar en un ArrayList los cantantes con las propiedades de la primera clase. En el método main, 
    se introducirán los cantantes y recuperará el listado de los cantantes.
 */
package EJERCICIO_04;

import EJERCICIO_04.ListaCantantes;

/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class EJERCICIO_04 {

    public static void main(String[] args) {

        //Creamos el arraylist para guardar cantantes
        ListaCantantes cantantes = new ListaCantantes();

        //Añadimos los cantantes usando el método creado en ListaCantante
        cantantes.anadirCantante("Nino Bravo");
        cantantes.anadirCantante("Jose Jose");
        cantantes.anadirCantante("Miguel Gallardo");
        cantantes.anadirCantante("Camilo Sesto");
        cantantes.anadirCantante("Sandro");
        cantantes.anadirCantante("Leonardo Favio");
        cantantes.anadirCantante("Roberto Carlos");
        cantantes.anadirCantante("Amanda Miguel");

        //Devolvemos el listado usando los métodos.
        cantantes.listadoCantantes();

        cantantes.obtenerListadoFormateado();
    }
}
