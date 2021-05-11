/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.nulos;

import java.sql.*;
import sv.edu.udb.util.Conexion;

/**
 *
 * @author carlo
 */
public class InsertNulos {

    public static void main(String[] args) throws SQLException {
        // TODO code application logic here

        Conexion con = new Conexion();
        String sql = "select nombre from empleados ";
        ResultSet rs;

        con.setRs(sql);
        rs = con.getRs();
        String nombre;

        while (rs.next()) {
            nombre = rs.getString(1);
            if (null == nombre) {
                System.out.println("Nombre 'Null': " + nombre);
            } else {
                switch (nombre) {
                    case "":
                        System.out.println("Nombre Vacio: " + nombre);
                        break;
                    default:
                        System.out.println("Nombre Con Datos: " + nombre);
                        break;
                }
            }
        }
        con.cerrarConexion();
    }
}
