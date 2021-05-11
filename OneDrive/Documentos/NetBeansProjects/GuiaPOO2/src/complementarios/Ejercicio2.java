/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementarios;

import java.lang.reflect.Array;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //En una tienda se realizan diferentes descuentos a sus clientes al momento de cancelar en caja.
        //Cuando se dispone a cancelar tiene la oportunidad de sacar una bolita y dependiendo del color
        //de la misma se le puede aplicar un determinado descuento. Si la bolita es roja, se le aplica un
        //10% de descuento sobre la compra; si la bola es verde, se le aplica un 5% de descuento y si la
        //bolita es blanca, no tiene descuento y se le da las gracias por participar

        //declaración de variables
        String gasto;
        int bolita;
        double compra, descuento = 0, monto;

        gasto = JOptionPane.showInputDialog("Ingrese el total de la compra:");
        compra = Double.parseDouble(gasto);

        //leemos el color de la bolita
        gasto = JOptionPane.showInputDialog("Ingrese el color de la bolita:\n Si es Roja ingrese 1\n Si es Verde ingrese 2\n Si es Blanca ingrese 3 ");
        bolita = Integer.parseInt(gasto);

        //por medio del swith verificamos la opción que seleciono
        switch (bolita) {
            case 1:
                descuento = compra * 0.10;
                monto = compra - descuento;
                break;
            case 2:
                descuento = compra * 0.05;
                monto = compra - descuento;
                break;
            case 3:
                monto = compra;
                break;
            default:
                monto = compra;
                break;
        }

        JOptionPane.showMessageDialog(null, "La compra fue de: $" + compra +
                "\nY el descuento fue de: $" + descuento + "\n Por lo su total a pagar es de: $" + monto);
    }

}
