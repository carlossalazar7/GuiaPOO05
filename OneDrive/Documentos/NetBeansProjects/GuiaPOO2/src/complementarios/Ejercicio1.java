package complementarios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlo
 */
import java.awt.HeadlessException;
import javax.swing.*;

public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Al ingresar la nota de un alumno, se desea saber si este aprobó o no una materia en el colegio.
        //Para aprobar se necesita una nota mayor o igual a 7.0. Diseñe una aplicación en Java que al
        //ingresar la nota muestre con un mensaje en el cual indique si el alumno aprobó o no. Además, si
        //la nota está entre 6.50 y 6.99, tiene la posibilidad de realizar un examen de suficiencia para
        //aprobar.
        while (true) {
            try {
                JOptionPane.showMessageDialog(null, "Ingrese los datos solicitados", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
                String Materia = JOptionPane.showInputDialog("ingrese materia a evaluar");
                String strinota = JOptionPane.showInputDialog("Ingrese Nota obtenida");

                float nota = Float.parseFloat(strinota);
                if (nota > 0 && nota <= 10) {
                    if (nota >= 7) {
                        JOptionPane.showMessageDialog(null, "La materia  " + Materia + " Ha sido aprobada con una nota de: " + nota, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    }
                    if (nota >= 6.50 && nota <= 6.99) {
                        JOptionPane.showMessageDialog(null, "La materia " + Materia + " ha generado la posibilidad de realizar un examen de suficiencia: ", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    }
                    if (nota > 0 && nota < 6.50) {
                        JOptionPane.showMessageDialog(null, "La materia " + Materia + " Ha sido reprobada con la nota: " + nota, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese nota en el rango permitido", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (HeadlessException | NumberFormatException e) {
                System.out.println("Error en algun dato de entrada");
                JOptionPane.showMessageDialog(null, "Error en algun dato de entrada", "Error", JOptionPane.ERROR_MESSAGE);
                String seleccion = (String) JOptionPane.showInputDialog(null, "Desea Salir", "Seleccione una opcion", JOptionPane.QUESTION_MESSAGE,
                        null, // null para icono defecto
                        new Object[]{"Si", "No"},
                        "si");
                if (seleccion.equals("Si")) {
                    System.exit(0);
                    break;

                }
            }
        }
    }

}
