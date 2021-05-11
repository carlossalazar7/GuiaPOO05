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
public class ControlIf3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int result = JOptionPane.showConfirmDialog(null, "Replace existing selection?");
        System.out.println("El numero devuelto es: " + result);
        switch (result) {
            case JOptionPane.YES_OPTION:
                System.out.println("Yes");
                break;
            case JOptionPane.NO_OPTION:
                System.out.println("No");
                break;
            case JOptionPane.CANCEL_OPTION:
                System.out.println("Cancel");
                break;
            case JOptionPane.CLOSED_OPTION:
                System.out.println("Closed");
                break;
            default:
                break;
        }

    }

}
