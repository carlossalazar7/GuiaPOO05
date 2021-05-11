/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.complementarios;

import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sv.edu.udb.util.Conexion;
import sv.edu.udb.util.ValidarAge;

/**
 *
 * @author carlo
 */
public class Alumno {

    Conexion con;
    String sql;
    String name;
    String apellido;
    int age;
    String direction;
    int id;

    public Alumno() throws SQLException {
        this.con = new Conexion();
    }

    public void show() {
        try {

            sql = "SELECT * FROM alumno";
            con.setRs(sql);
            while (con.getRs().next()) {
                JOptionPane.showMessageDialog(null, "id: " + con.getRs().getInt(1) + "\n"
                        + "nombre: " + con.getRs().getString(2) + "\n" + "apellido: " + con.getRs().getString(3) + "\n"
                        + "edad: " + con.getRs().getInt(4) + "\n" + "direccion: " + con.getRs().getString(5) + "\n"
                        + "**********************************"
                );
            }
        } catch (SQLException e) {
            System.out.print(e);
        }
    }

    public int insert() {
        try {
            name = JOptionPane.showInputDialog("Ingrese su nombre: ");
            apellido = JOptionPane.showInputDialog("Ingrese su apellido: ");
            age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
            direction = JOptionPane.showInputDialog("Ingrese su dirección: ");

            do {
                if (ValidarAge.Age(age) == false) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "La edad debe ser mayor a 0");
                    age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
                }
            } while (true);

            sql = "INSERT INTO `alumno`(`Nombre`, `Apellido`, `Edad`, `Direccion`) "
                    + "VALUES(" + "'" + name + "'" + "," + "'" + apellido + "'" + "," + age + ","
                    + "'" + direction + "'" + ")";

            con.setQuery(sql);
            return 1;

        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }

    public int delete() {
        try {
            id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del alumno de desea eliminar"));
            sql = "DELETE FROM `alumno` WHERE Cod_alumno  =" + "'" + id + "'" + " ";
            con.setQuery(sql);
            return 1;

        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }

    public int updte() {
        try {
            id = Integer.parseInt(JOptionPane.showInputDialog("ingrese el id del alumno: "));
            name = JOptionPane.showInputDialog("Ingrese su nombre: ");
            apellido = JOptionPane.showInputDialog("Ingrese su apellido: ");
            age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
            direction = JOptionPane.showInputDialog("Ingrese su dirección: ");
            
                do {
                if (ValidarAge.Age(age) == false) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "La edad debe ser mayor a 0");
                    age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
                }
            } while (true);
                
            
            sql = "UPDATE `alumno` SET `Nombre`=" + "'" + name + "'" + ",`Apellido`=" + "'" + apellido + "'"
                    + ",`Edad`=" + age + ",`Direccion`=" + "'" + direction + "'" + " WHERE `Cod_alumno`= " + id + " ";
            con.setQuery(sql);
            return 1;

        } catch (HeadlessException | NumberFormatException | SQLException e) {
            System.out.println(e);
            return 0;
        }

    }

}
