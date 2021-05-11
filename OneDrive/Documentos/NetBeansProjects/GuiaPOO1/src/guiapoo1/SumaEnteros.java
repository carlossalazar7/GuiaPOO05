/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapoo1;

import javax.swing.*;

/**
 *
 * @author carlo
 */
public class SumaEnteros {

    public static void main(String[] args) {
        String num1;
        String num2;
        int n1;
        int n2;
        int sum;

        num1 = JOptionPane.showInputDialog("Digite el primer numero");
        num2 = JOptionPane.showInputDialog("Digite el segundo numero");

        n1 = Integer.parseInt(num1);
        n2 = Integer.parseInt(num2);

        sum = n1 + n2;

        sum = n1 + n2;
        JOptionPane.showMessageDialog(null, "La suma es:" + sum, "Resultado", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);

    }
}
