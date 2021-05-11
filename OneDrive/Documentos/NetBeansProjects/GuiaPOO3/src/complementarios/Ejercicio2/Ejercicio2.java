/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementarios.Ejercicio2;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        // TODO code application logic here

        CalculadoraBasica cal = new CalculadoraBasica(0, 0);
        CalculadoraAvanzada cal2 = new CalculadoraAvanzada(0, 0);
        int op = 0;

        while (true) {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog("ingrese 1 si quiere ocupar la calculadora básica "
                        + "\nIngrese 2 si quiere ocupar la calculadora ciéntifica \n Ingrese 3 si quiere salir"));

                switch (op) {
                    case 1:
                        op = Integer.parseInt(JOptionPane.showInputDialog("ingrese 1 si quiere sumar \nIngrese 2 si quiere restar \nIngrese 3 si quiere dividir \nIngrese 4 si quiere multiplicar"));
                        //calculadora básica
                        switch (op) {
                            case 1:
                                //suma
                                cal.setNumero1(Integer.parseInt(JOptionPane.showInputDialog("ingrese el parametro 1:")));
                                cal.setNumero2(Integer.parseInt(JOptionPane.showInputDialog("ingrese el parametro 2:")));
                                JOptionPane.showMessageDialog(null, cal.sumar(cal.getNumero1(), cal.getNumero2()));
                                break;
                            case 2:
                                //resta
                                cal.setNumero1(Integer.parseInt(JOptionPane.showInputDialog("ingrese el parametro 1:")));
                                cal.setNumero2(Integer.parseInt(JOptionPane.showInputDialog("ingrese el parametro 2:")));
                                JOptionPane.showMessageDialog(null, cal.restar(cal.getNumero1(), cal.getNumero2()));
                                break;
                            case 3:
                                // dividir
                                cal.setNumero1(Integer.parseInt(JOptionPane.showInputDialog("ingrese el parametro 1:")));
                                cal.setNumero2(Integer.parseInt(JOptionPane.showInputDialog("ingrese el parametro 2:")));
                                JOptionPane.showMessageDialog(null, cal.dividir(cal.getNumero1(), cal.getNumero2()));
                                break;
                            case 4:
                                //multiplicar
                                cal.setNumero1(Integer.parseInt(JOptionPane.showInputDialog("ingrese el parametro 1:")));
                                cal.setNumero2(Integer.parseInt(JOptionPane.showInputDialog("ingrese el parametro 2:")));
                                JOptionPane.showMessageDialog(null, cal.multiplicar(cal.getNumero1(), cal.getNumero2()));
                                break;
                            default:
                                JOptionPane.showInternalMessageDialog(null, "Ingrese una opción valida!!");
                                break;
                        }
                        break;
                    case 2:
                        op = Integer.parseInt(JOptionPane.showInputDialog("ingrese 1 si quiere potencia \nIngrese 2 si quiere opuesto \nIngrese 3 si quiere factorial"));
                        switch (op) {
                            case 1:
                                //potencia
                                cal2.setNumero1(Integer.parseInt(JOptionPane.showInputDialog("ingrese la base: ")));
                                cal2.setNumero2(Integer.parseInt(JOptionPane.showInputDialog("ingrese el exponente: ")));
                                JOptionPane.showMessageDialog(null, cal2.potencia(cal2.getNumero1(), cal2.getNumero2()));
                                break;
                            case 2:
                                //opuesto
                                cal2.setNumero1(Integer.parseInt(JOptionPane.showInputDialog("ingrese la base: ")));
                                JOptionPane.showMessageDialog(null, cal2.opuesto(cal2.getNumero1()));
                                break;
                            case 3:
                                //factorial
                                cal2.setNumero1(Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero: ")));
                                JOptionPane.showMessageDialog(null, cal2.factorial(cal2.getNumero1()));
                                break;
                            default:
                                break;
                        }
                        break;
                    case 3:
                        System.exit(0);
                        break;
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
