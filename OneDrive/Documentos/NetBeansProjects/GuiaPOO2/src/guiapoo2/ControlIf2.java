/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapoo2;

import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class ControlIf2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String v1 = "";
        v1 = JOptionPane.showInputDialog("Ingrese un valor");
        if (v1 == null) {
            JOptionPane.showMessageDialog(null, "Apretaste cancelar");
        } else {
            if (v1.equals("")) {
                JOptionPane.showMessageDialog(null, "No ingresaste nada");
            } else {
                JOptionPane.showMessageDialog(null, "El valor de V1 es: " + v1);
            }
        }
    }
}
