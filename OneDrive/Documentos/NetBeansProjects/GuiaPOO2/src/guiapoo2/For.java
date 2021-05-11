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
public class For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String strnumero = JOptionPane.showInputDialog("Ingrese un Numero: ");
        int numero = Integer.parseInt(strnumero);
        int valor = numero;
        //long resultado=1;
        for (int i = 1; i < valor; i++) {
            numero = numero * i;
            System.out.println(numero);
        }
        JOptionPane.showMessageDialog(null, "El factorial de " + valor + " es: "
                + numero, "Respuesta", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("El factorial es " + numero);

    }

}
