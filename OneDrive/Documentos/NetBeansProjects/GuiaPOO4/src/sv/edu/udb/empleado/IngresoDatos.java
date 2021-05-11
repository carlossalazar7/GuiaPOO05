/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.empleado;

import java.sql.*;
import javax.swing.JOptionPane;
import sv.edu.udb.util.MatchTelephone;

/**
 *
 * @author carlo
 */
public class IngresoDatos {

    private int id;
    private String ids;
    private String nombre;
    private String apellido;
    private String telefono;
    private Connection conexion;
    private ResultSet rs;
    private Statement s;

    public IngresoDatos() {
        // Se utiliza un try por los posibles errores de MySQL
        try {
            //obtenemos el driver de para mysql
            Class.forName("com.mysql.jdbc.Driver");
            // Se obtiene una conexión con la base de datos.
            conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/guia4poo", "root", "");
            // IMPORTANTE: EL CAMPO PASSWORD DEBE IR EN BLANCO POR DEFECTO,
            // DEBE ASIGNAR EL PASSWORD CORRECTO 
            // Permite ejecutar sentencias SQL sin parámetros
            s = conexion.createStatement();
            //Metodo para ingresar valores
            ingreso();
            s.executeUpdate(
                    "Insert into Empleados values(" + id + ",\"" + nombre + "\",\"" + apellido + "\",\"" + telefono + "\")"
            );
            JOptionPane.showMessageDialog(null, "Persona Ingresada Correctamente");
        } catch (ClassNotFoundException e1) {
            //Error si no puedo leer el driver de MySQL
            System.out.println("ERROR:No encuentro el driver de la BD: " + e1.getMessage());
            System.exit(0);
        } catch (SQLException e2) {
            //Error SQL: login/passwdó sentencia sql erronea
            System.out.println("ERROR:Fallo en SQL: " + e2.getMessage());
            System.exit(0);
        }
    }

    public void ingreso() {

        ids = JOptionPane.showInputDialog("Ingrese el ID");
        id = Integer.parseInt(ids);
        nombre = JOptionPane.showInputDialog("Ingrese el Nombre");
        apellido = JOptionPane.showInputDialog("Ingrese el Apellido");
        telefono = JOptionPane.showInputDialog("Ingrese su Telefono");

        do {
            if (MatchTelephone.compareTelephone(telefono) == true) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Numero de Telefono invalido");
                telefono = JOptionPane.showInputDialog("Ingrese su Telefono");
            }
        } while (true);
    }

    public void mostrardatos() throws SQLException {
        rs = s.executeQuery("select * from Empleados");
        while (rs.next()) {
            JOptionPane.showMessageDialog(null, "ID: " + rs.getString("Codigo")
                    + "\nNombre: " + rs.getString("Nombre")
                    + "\nApellidos: " + rs.getString("Apellidos")
                    + "\nTelefono: " + rs.getString("Telefono")
            );
        }
    }

    public void cierreconexion() throws SQLException {
// Se cierra la conexión con la base de datos.
        if (conexion != null) {
            conexion.close();
        }
    }

    public static void main(String[] args) throws SQLException {
        IngresoDatos ing = new IngresoDatos();
        ing.mostrardatos();
        ing.cierreconexion();
    }
}
