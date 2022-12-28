/*
 * Clase para crear un arrayList dónde guardar objetos de la clase cantante
 */
package EJERCICIO_04;

import java.util.ArrayList;

/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class ListaCantantes {

    //Declaramos e inicializamos el arraylist
    private ArrayList<Cantante> cantantes = new ArrayList<>();

    //Método constructor vacío
    public void ListaCantantes() {
    }

    //Método para añadir nombre de cantantes  
    public void anadirCantante(String nombre) {
        cantantes.add(new Cantante(nombre));
    }

    //Método para devolver el listado de cantantes formateado
    public ArrayList<Cantante> obtenerListadoFormateado() {
        for (int x = 0; x < cantantes.size(); x++) {
            System.out.println("Cantante: " + cantantes.get(x).getNombre());
        }
        return cantantes;
    }

    //Método para devolver el listado sin formatear
    public ArrayList<Cantante> listadoCantantes() {
        for (int x = 0; x < cantantes.size(); x++) {
            System.out.println(cantantes.get(x).getNombre());
        }
        return cantantes;
    }
}
