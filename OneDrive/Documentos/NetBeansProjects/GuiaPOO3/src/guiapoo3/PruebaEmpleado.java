/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapoo3;

/**
 *
 * @author carlo
 */
import javax.swing.JOptionPane;

public class PruebaEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Objeto de tipo Empleado
        Empleado emp = new Empleado(); 
//Objeto de tipo profesor
        Profesor pro = new Profesor(); 
        
        JOptionPane.showMessageDialog(null, "claseempleado");
//Utilizando los metodos de Empleado
        emp.ingresodatos();
        emp.mostrardatos();
        JOptionPane.showMessageDialog(null, "clase profesor");
//Utilizando los metodos de profesor

        pro.ingreso2();
        pro.mostrar2();
    }

}
