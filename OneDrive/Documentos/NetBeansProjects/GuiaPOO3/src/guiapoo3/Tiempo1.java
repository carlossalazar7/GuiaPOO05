/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapoo3;

import java.text.DecimalFormat;

/**
 *
 * @author carlo
 */
public class Tiempo1 extends Object {

    private int hora;
    private int minuto;
    private int segundo;

    //El constructor de tiempo1 inicializa cada variable de instancia en cero
    // se adegura de que cada objeto tiempo1 inicie en un estado consistente
    public Tiempo1() {
        establecerHora(0, 0, 0);
    }

    //establecer un nuevo valor de hora utilizando hora universal
    //realizar comprobaciobes de validez en los datos; establecer valores inválidos en cero
    public void establecerHora(int h, int m, int s) {
        hora = ((h >= 0 && h < 24) ? h : 0);
        minuto = ((m >= 0 && m < 60) ? m : 0);
        segundo = ((s >= 0 && s < 60) ? s : 0);
    }

    public String aStringUniversal() {
        DecimalFormat dosDigitos = new DecimalFormat("00");
        return dosDigitos.format(hora) + ":" + dosDigitos.format(minuto) + ":" + dosDigitos.format(segundo);
    }

    //convertimos a String en formato de hora estándar
    public String aStringEstandar() {
        DecimalFormat dosDigitos = new DecimalFormat("00");
        return ((hora == 12 || hora == 0) ? 12 : hora % 12) + ":" + dosDigitos.format(minuto) + ":" + dosDigitos.format(segundo) + (hora < 12 ? "AM" : "PM");

    }

}
