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

/**
 *
 * @author carlo
 */
public class Materia {

    String sql;
    Conexion con;
    int id;
    String name;
    String description;

    public Materia() throws SQLException {
        this.con = new Conexion();
    }

    public void show() {
        try {
            sql = "SELECT * FROM materia";
            con.setRs(sql);
            while (con.getRs().next()) {
                JOptionPane.showMessageDialog(null, "id: " + con.getRs().getInt(1) + "\n"
                        + "nombre: " + con.getRs().getString(2) + "\n" + "descripción: " + con.getRs().getString(3) + "\n"
                        + "**********************************"
                );
            }
        } catch (SQLException e) {
            System.out.print(e);
        }
    }

    public int insert() {
        try {
            //pedir datos
            name = JOptionPane.showInputDialog("Ingrese su nombre: ");
            description = JOptionPane.showInputDialog("Ingrese descripción: ");

            //preparar consulta
            sql = "INSERT INTO `materia`(`Nombre`, `Descripcion`) VALUES('" + name + "'" + " , '" + description + "'" + ")";
            con.setQuery(sql);
            return 1;

        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }

    public int delete() {
        try {
            id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de la materia que desea eliminar"));
            sql = "DELETE FROM `materia` WHERE 	Cod_materia  =  '" + id + "'  ";
            con.setQuery(sql);
            return 1;

        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }

    public int updte() {
        try {
            id = Integer.parseInt(JOptionPane.showInputDialog("ingrese el id de la materia: "));
            name = JOptionPane.showInputDialog("Ingrese el nombre: ");
            description = JOptionPane.showInputDialog("Ingrese la descripción: ");

            sql = " UPDATE `materia` SET `Nombre`= '" + name + "' , `Descripcion` =  '" + description + "'   WHERE `Cod_materia`= " + id + " ";
            con.setQuery(sql);
            return 1;

        } catch (HeadlessException | NumberFormatException | SQLException e) {
            System.out.println(e);
            return 0;
        }

    }

}
