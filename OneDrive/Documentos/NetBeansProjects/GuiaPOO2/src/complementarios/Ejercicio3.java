/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementarios;

import java.awt.HeadlessException;
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
        /*Modificar el ejemplo 9 de tal forma que me permita leer el número de empleados de los cuales 
        voy a ingresar el sueldo, además el programa no permitirá leer datos negativos, así que al
        ingresar un dato negativo me dará un error y me pedirá de nuevo el dato, si el dato sigue siendo
        negativo no me permitirá ingresar el sueldo de otro empleado hasta que se ingrese el valor
        positivo del sueldo.*/
        String leer;
        double sueldo, mayor = 0, menor = 10000;
        int i = 1, contador = 0;
        int cantidad;
        while (true) {
            try {
                cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantos usuarios va a ingresar: "));

                while (i <= cantidad) {
                    leer = JOptionPane.showInputDialog("Ingrese el Sueldo del Empleado " + i);
                    sueldo = Double.parseDouble(leer);

                    while (sueldo < 0) {
                        leer = JOptionPane.showInputDialog("ERROR, El sueldo debe ser positivo" + i, JOptionPane.ERROR_MESSAGE);
                        sueldo = Double.parseDouble(leer);

                    }
                    if (sueldo > 300) {
                        contador = contador + 1;
                    }
                    if (sueldo > mayor) {
                        mayor = sueldo;
                    }
                    if (sueldo < menor) {
                        menor = sueldo;
                    }
                    i = i + 1;

                }
                JOptionPane.showMessageDialog(null, " El sueldo Mayor es de $: " + mayor + "\nEl sueldo Menor es de $: " + menor + "\n" + contador + " Empleados tienen un sueldo mayor de $300");

            } catch (HeadlessException | NumberFormatException e) {
                System.out.println("Error en algun dato de entrada");
                JOptionPane.showMessageDialog(null, "Error en algun dato de entrada", "Error", JOptionPane.ERROR_MESSAGE);
                String seleccion = (String) JOptionPane.showInputDialog(null, "Desea Salir", "Seleccione una opcion", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si", "No"}, "si");
                if (seleccion.equals("Si")) {
                    System.exit(0);
                    break;
                }

            }

        }
    }

}
