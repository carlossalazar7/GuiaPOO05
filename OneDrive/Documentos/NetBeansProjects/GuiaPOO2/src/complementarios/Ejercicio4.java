/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementarios;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Desarrollar una aplicación que utilice un HashMap y en el cual se permita manejar la
        información de los alumnos de la materia de POO, para este caso se necesita tener una lista
        siendo la llave el “Carnet”, esta aplicación deberá de tener un menú en el cual se tenga como
        opciones las que se detallan a continuación.
        
             Ingreso de estudiante.
             Ver estudiante
             Buscar Estudiante
             Salir*/
        Scanner sn = new Scanner(System.in);
        HashMap<String, String> listaEstudiantes = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        String carnet;
        String nombre;

        while (opcion != 4) {
            System.out.println("Introduce el numero de la opción que quieras:");
            System.out.println("1.- Agregar Estudiante");
            System.out.println("2.- Ver Estudiantes");
            System.out.println("3.- Buscar Estudiantes");
            System.out.println("4.- Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Carnet De Estudiante:");
                    carnet = sc.next();

                    System.out.println("Introduce el nombre de Estudiante:");
                    nombre = sc.next();

                    IngresarEstudiante(carnet, nombre, listaEstudiantes);
                    break;
                case 2:
                    VerEstudiantes(listaEstudiantes);
                    break;
                case 3:
                    System.out.println("Introduce el carnet del estudiante a Buscar:");
                    carnet = sc.next();
                    BuscarEstudiante(carnet, listaEstudiantes);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Tienes que introducir una opción valida");
            }

        }
    }

    public static void IngresarEstudiante(String carnet, String nombre, HashMap<String, String> listaEstudiantes) {
        if (listaEstudiantes.containsKey(carnet)) {
            System.out.println("No se puede Ingresar el estudiante. El carnet ya existe.");
        } else {
            listaEstudiantes.put(carnet, nombre);
        }
    }

    public static void VerEstudiantes(HashMap<String, String> listaEstudiantes) {
        String clave;
        Iterator<String> Estudiantes = listaEstudiantes.keySet().iterator();
        System.out.println("Lista de estudiantes de poo:");
        while (Estudiantes.hasNext()) {
            clave = Estudiantes.next();
            int contador = 1;
            System.out.println((contador++) + ".\t" + clave + " - " + listaEstudiantes.get(clave));
        }
    }

    public static void BuscarEstudiante(String carnet, HashMap<String, String> listaEstudiantes) {
        Scanner sc = new Scanner(System.in);
        String clave;
        int contador = 1;
        if (listaEstudiantes.containsKey(carnet)) {
            Iterator<String> Estudiantes = listaEstudiantes.keySet().iterator();
            clave = Estudiantes.next();
            System.out.println((contador++) + ".\t" + clave + " - " + listaEstudiantes.get(clave));
        } else {
            System.out.println("Carnet No existe.");
        }

    }

}
