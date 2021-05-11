/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapoo2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author carlo
 */
public class UtilesEscolares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declarando HashMap
        HashMap<Integer, String> hmap = new HashMap<>();
        //Agregando elementos
        hmap.put(12, "Crayolas");
        hmap.put(2, "Lápices");
        hmap.put(7, "Borradores");
        hmap.put(49, "Colores");
        hmap.put(3, "Boligrafos");
        //Mostrando contenido usando Iterator
        System.out.println("Contenido de HashMap:");
        Set set = hmap.entrySet();
        Iterator iterador = set.iterator();
        while (iterador.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterador.next();
            System.out.println("Clave: " + mentry.getKey() + " - Valor: "
                    + mentry.getValue());
        }
//Obtener valor en base a clave
        String var = hmap.get(2);
        System.out.println("\nValor asociado a clave 2: " + var);
        //Remover elementos en base a clave
        hmap.remove(3);
        System.out.println("\nHashMap después de eliminar elemento con clave 3:");
        Set set2 = hmap.entrySet();
        Iterator iterador2 = set2.iterator();
        while (iterador2.hasNext()) {
            Map.Entry mentry2 = (Map.Entry) iterador2.next();
            System.out.println("Clave: " + mentry2.getKey() + " - Valor: " + mentry2.getValue());

        }
    }
}
