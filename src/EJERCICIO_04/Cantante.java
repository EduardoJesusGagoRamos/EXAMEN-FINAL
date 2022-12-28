/*
 *Clase Cantante
 */
package EJERCICIO_04;

/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class Cantante {

    //Propiedades de la clase
    private String nombre;

    //Método constructor vacío
    public Cantante() {
    }

    //Método constructor con parámetros
    public Cantante(String nombre) {
        this.nombre = nombre;
    }

    //Método para obtener el nombre del cantante
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String devolverCantante() {
        return "Nombre: " + nombre;
    }
}
