/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapoo3;

import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class PruebaTiempo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //llamar al constructor Tiempo1
        Tiempo1 tiempo = new Tiempo1();

        //anexar versión String de tiempo a salida String
        String salida = "La hora universal inicial es: " + tiempo.aStringEstandar() + "\n La hora estándar es: " + tiempo.aStringEstandar();

        // cambiar tiempo y anexar hora actualizada a salida
        tiempo.establecerHora(13, 27, 6);

        salida += "\n\nLa hora universal después de establecerHora es:" + tiempo.aStringUniversal() + "\nLa hora estándar después de establecerHora es: "
                + tiempo.aStringEstandar();

        // establecer tiempo con valores inválidos; anexar hora actualizada a salida
        tiempo.establecerHora(99, 99, 99);

        salida += "\n\nDespués de intentar ajustes inválidos: " + "\nHora universal: " + tiempo.aStringUniversal() + "\nHora estándar: " + tiempo.aStringEstandar();
         JOptionPane.showMessageDialog(null, salida, "Prueba de la clase Tiempo1", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

}
