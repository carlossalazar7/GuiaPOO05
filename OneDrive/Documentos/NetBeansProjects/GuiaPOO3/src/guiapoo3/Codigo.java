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
class Clase {

    static int contador;

    public Clase() { //Constructor
        contador++;
    }

    public int getContador() { //Obtenemos el valor de contador
        return contador;
    }
}

public class Codigo {

    public static void main(String[] args) {
        Clase uno = new Clase();
        Clase dos = new Clase();
        Clase tres = new Clase();
        System.out.println("Hemos declarado " + tres.getContador() + " objetos.");
    }
    
}
