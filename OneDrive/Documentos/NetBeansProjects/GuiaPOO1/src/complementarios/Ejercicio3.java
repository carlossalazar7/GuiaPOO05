/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementarios;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear un programa en java que solicite la información básica de acuerdo a los siguiente:
        //-> Nombres
        //-> Apellidos
        //-> Edad
        //-> Carrera
        //Tomando en cuenta las instrucciones del ejercicio anterior, crear un programa que ahora
        // utilice las cajas de texto de JoptionPane, tanto para captura de datos como para impresión
        // de información. Para la impresión de información deberá realizarla en una sola caja de
        // texto y dando un salto de línea entre cada dato solicitado

        String name;
        String lastName;
        int age;
        String career;

        name = JOptionPane.showInputDialog("ingresu sus nombre: ");
        lastName = JOptionPane.showInputDialog("ingree sus apellidos: ");
        age = Integer.parseInt(JOptionPane.showInputDialog("ingree su edad: "));
        career = JOptionPane.showInputDialog("ingree su carrera: ");

        JOptionPane.showConfirmDialog(null, "Su nombre completo es: " + name + " " + lastName + "\n" + "Edad: " + age + "\n" + "Carrera: " + career);
    }

}
