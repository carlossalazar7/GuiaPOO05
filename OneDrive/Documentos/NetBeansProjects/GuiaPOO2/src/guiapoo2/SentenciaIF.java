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
public class SentenciaIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String datos;
        double sueldo, afp = 0, isss, totalre, nsueldo, renta;
        datos = JOptionPane.showInputDialog(" Ingrese el sueldo del empleado (a) ");
        sueldo = Double.parseDouble(datos);
        if (sueldo > 300) {
            afp = (sueldo * 0.0625);
        }
        JOptionPane.showMessageDialog(null, " Este empleado tiene un sueldo de " + sueldo + " y el descuento del AFP es " + afp);
        datos = (String) JOptionPane.showInputDialog(null,
                "Ingrese el Sexo:\nSi es Masculino (M)\nSi es Femenino (F)",
                "Sexo del Empleado", JOptionPane.QUESTION_MESSAGE,
                null, //Icono por defecto
                new Object[]{"M", "F"},
                "F"); //opcion por defecto
        if ("M".equals(datos))//Si es de sexo Masculino
        {
            isss = sueldo * 0.03;
            renta = sueldo * 0.10;
            totalre = afp + isss + renta;
            nsueldo = sueldo - totalre;
            
            JOptionPane.showMessageDialog(null, "A este empleado se le detiene" + isss + "en concepto de ISSS  \n "
                    + "Ademas se le retiene: " + renta + " En concepto de Renta       \n Lo que hace un total de "
                    + totalre + "\nY su nuevo Sueldo es de:" + nsueldo
            );
        }

    }

}
