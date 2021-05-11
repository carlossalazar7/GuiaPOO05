/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.complementarios;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import sv.edu.udb.util.Conexion;

/**
 *
 * @author carlo
 */
public class AlumnoMateria {

    String sql;
    Conexion con;

    public AlumnoMateria() throws SQLException {
        this.con = new Conexion();
    }

    public void show(int id) {

        try {
            sql = "SELECT m.Nombre  FROM alumno_materia AM INNER JOIN alumno a on a.Cod_alumno"
                    + " = AM.Cod_alumno INNER JOIN materia m ON m.Cod_materia = AM.Cod_materia WHERE a.Cod_alumno = " + id + " ";
            con.setRs(sql);
            
            while (con.getRs().next()) {
                JOptionPane.showMessageDialog(null, "materia: " + con.getRs().getString(1) + "\n");
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

}
