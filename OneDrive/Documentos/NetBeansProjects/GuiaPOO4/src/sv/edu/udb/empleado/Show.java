/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.empleado;

import java.sql.*;

/**
 *
 * @author carlo
 */
public class Show {

    public Show() {
// Se utiliza un try por los posibles errores de MySQL
        try {
            //obtenemos el driver de para mysql
            Class.forName("com.mysql.jdbc.Driver");
            // Se obtiene una conexión con la base de datos.
            Connection conexion;
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/guia4poo", "root", "");
            // IMPORTANTE: EL CAMPO PASSWORD POR DEFECTO DEBE IR EN BLANCO,
            // DEBE ASIGNAR EL PASSWORD CORRECTO
            // Permite ejecutar sentencias SQL sin parámetros
            Statement s = conexion.createStatement();
            // Contiene la tabla resultado de la pregunta SQL que se haya realizado
            ResultSet rs = s.executeQuery("select * from Empleados");
            //Se recorre el ResultSet, mostrando por pantalla los resultados.
            while (rs.next()) {
                //Podemos mostrar los datos de otra forma ver mas abajo e la guia.
                System.out.println(
                          "ID: " + rs.getInt(1)
                        + "\nNombre: " + rs.getString(2)
                        + "\nApellidos: " + rs.getString(3)
                        + "\nTelefono: " + rs.getString(4));
                System.out.println("**********************************");
            }
            // Se cierra la conexión con la base de datos. NUNCA OLVIDE CERRARLA
            conexion.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ERROR:No encuentro el driver de la BD:" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Show verEmpleado = new Show();
    }

}
