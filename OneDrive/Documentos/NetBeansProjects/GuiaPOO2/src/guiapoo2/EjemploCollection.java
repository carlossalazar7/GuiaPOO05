/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapoo2;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author carlo
 */
public class EjemploCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Collection listaMarcasCoches; //El tipo de listaMarcasCoches es Collection 
        listaMarcasCoches = new ArrayList<>();
        //Agregando información
        listaMarcasCoches.add("Audi");
        listaMarcasCoches.add("Porsche");
        listaMarcasCoches.add("Aston Martin");
        listaMarcasCoches.add("Ferrari");
        listaMarcasCoches.add("Mercedes");
        listaMarcasCoches.add("Seat");
        System.out.println("Número elementos antes de eliminar: " + listaMarcasCoches.size());//Obtener tamaño de Collection
        System.out.println("Elementos: " + listaMarcasCoches.toString());
        listaMarcasCoches.remove("Seat"); //Removiendo elemento por nombre
        listaMarcasCoches.remove("Mercedes"); //Removiendo elemento por nombre
        System.out.println("Número elementos después de eliminar Seat y Mercedes:" + listaMarcasCoches.size());
        System.out.println("Elementos: " + listaMarcasCoches.toString());
    }
}
