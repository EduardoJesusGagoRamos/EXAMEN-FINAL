/*
 5. Crear un programa que use ArrayList de números reales. El programa debe permitir mostrar un menú donde se pueda agregar 
    un número, buscar un número, modificar un número, eliminar un número e insertar un número en una posición dada.
 */
package EJERCICIO_05;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class EJERCICIO_05 {

    ArrayList<Double> listaReales;

    public static void main(String[] args) {
        EJERCICIO_05 proyectoReales = new EJERCICIO_05();
        proyectoReales.listaReales = new ArrayList();
        proyectoReales.leerOpcion();
    }

    public void leerOpcion() {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\\nLista de Reales");
            System.out.println("[1] Agregar");
            System.out.println("[2] Buscar");
            System.out.println("[3] Modificar elemento");
            System.out.println("[4] Eliminar elemento");
            System.out.println("[5] Insertar elemento");
            System.out.println("[6] Mostrar elementos");
            System.out.println("[7] Salir\\n");
            System.out.print("Ingrese opcion (1-7): ");

            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    ingresarValor();
                    break;
                case 2:
                    buscarValor();
                    break;
                case 3:
                    modificarValor();
                    break;
                case 4:
                    eliminarValor();
                    break;
                case 5:
                    insertarValor();
                    break;
                case 6:
                    mostrarLista();
                    break;
            }
        } while (opcion != 7);
    }

    public void ingresarValor() {
        Scanner entrada = new Scanner(System.in);
        double valor;
        System.out.print("Ingrese valor: ");
        valor = entrada.nextDouble();
        listaReales.add(valor);
    }

    public void buscarValor() {
        Scanner entrada = new Scanner(System.in);
        double valor;
        int indice;
        System.out.print("Valor a buscar: ");
        valor = entrada.nextDouble();
        indice = listaReales.indexOf(valor);
        if (indice != -1) {
            System.out.println("Dato se encuentra en posicion: " + indice);
        } else {
            System.out.println("Dato no se encuentra");
        }
    }

    public void modificarValor() {
        Scanner entrada = new Scanner(System.in);
        double valor, nuevoValor;
        int indice;
        System.out.print("Valor a modificar: ");
        valor = entrada.nextDouble();
        indice = listaReales.indexOf(valor);
        if (indice != -1) {
            System.out.print("Nuevo valor: ");
            nuevoValor = entrada.nextDouble();
            listaReales.set(indice, nuevoValor);
        } else {
            System.out.println("Dato no se encuentra");
        }
    }

    public void eliminarValor() {
        Scanner entrada = new Scanner(System.in);
        double valor;
        int indice;
        System.out.print("Valor a eliminar: ");
        valor = entrada.nextDouble();
        indice = listaReales.indexOf(valor);
        if (indice != -1) {
            listaReales.remove(indice);
            System.out.println("Dato eliminado");
        } else {
            System.out.println("Dato no se encuentra");
        }
    }

    public void insertarValor() {
        Scanner entrada = new Scanner(System.in);
        double valor;
        int indice;
        System.out.print("Valor a insertar: ");
        valor = entrada.nextDouble();
        System.out.print("Posicion donde desea insertar: ");
        indice = entrada.nextInt();
        listaReales.add(indice, valor);
    }

    public void mostrarLista() {
        if (!listaReales.isEmpty()) {
            System.out.println("Elementos de la lista:");
            for (int i = 0; i < listaReales.size(); i++) {
                System.out.println(listaReales.get(i));
            }
        } else {
            System.out.println("No existen valores en la lista");
        }
    }
}
