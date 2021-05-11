/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.complementarios;

import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        int op;
        try {
            Alumno s = new Alumno();
            Materia materia = new Materia();
            AlumnoMateria am = new AlumnoMateria();

            while (true) {
                try {
                    op = Integer.parseInt(JOptionPane.showInputDialog("1.\t  Alumnos\n 2.\t Materias\n 3.\t Ver Materias por alumno"));
                    switch (op) {
                        case 1:
                            op = Integer.parseInt(JOptionPane.showInputDialog("1.\t show \n 2.\t insert \n 3.\t delete \n 4.\t update"));
                            switch (op) {
                                case 1:
                                    //mostrar datos
                                    s.show();
                                    break;
                                case 2:
                                    //insertar datos
                                    if (s.insert() == 1) {
                                        JOptionPane.showMessageDialog(null, "Succesfull", "Ingresado Correctamente", JOptionPane.INFORMATION_MESSAGE);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Error", "No se pudo ingresar", JOptionPane.ERROR_MESSAGE);
                                    }
                                    break;
                                case 3:
                                    // eliminar datos
                                    if (s.delete() == 1) {
                                        JOptionPane.showMessageDialog(null, "Succesfull", "Eliminado Correctamente", JOptionPane.INFORMATION_MESSAGE);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Error", "No se pudo eliminar", JOptionPane.ERROR_MESSAGE);
                                    }
                                    break;
                                case 4:
                                    //update
                                    if (s.updte() == 1) {
                                        JOptionPane.showMessageDialog(null, "Succesfull", "Actualizado Correctamente", JOptionPane.INFORMATION_MESSAGE);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Error", "No se pudo actualizar", JOptionPane.ERROR_MESSAGE);
                                    }
                                    break;
                            }
                            break;

                        case 2:
                            op = Integer.parseInt(JOptionPane.showInputDialog("1.\t show \n 2.\t insert \n 3.\t delete \n 4.\t update"));

                            switch (op) {
                                case 1:
                                    //mostrar materias
                                    materia.show();
                                    break;
                                case 2:
                                    //insertar materias
                                    if (materia.insert() == 1) {
                                        JOptionPane.showMessageDialog(null, "Succesfull", "Ingresado Correctamente", JOptionPane.INFORMATION_MESSAGE);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Error", "No se pudo ingresar", JOptionPane.ERROR_MESSAGE);
                                    }
                                    break;
                                case 3:
                                    //eliminar materias
                                    if (materia.delete() == 1) {
                                        JOptionPane.showMessageDialog(null, "Succesfull", "Eliminado Correctamente", JOptionPane.INFORMATION_MESSAGE);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Error", "No se pudo eliminar", JOptionPane.ERROR_MESSAGE);
                                    }
                                    break;
                                case 4:
                                    //actualizar materias
                                    if (materia.updte() == 1) {
                                        JOptionPane.showMessageDialog(null, "Succesfull", "Actualizado Correctamente", JOptionPane.INFORMATION_MESSAGE);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Error", "No se pudo actualizar", JOptionPane.ERROR_MESSAGE);
                                    }
                                    break;
                            }
                            break;
                        case 3:
                            int id = Integer.parseInt(JOptionPane.showInputDialog("ingrese el id del alumno: "));
                            am.show(id);
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

        } catch (HeadlessException | SQLException e) {
            System.out.println(e);
        }
    }
}
