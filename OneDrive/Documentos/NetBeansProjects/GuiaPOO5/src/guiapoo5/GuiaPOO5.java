/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapoo5;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author carlo
 */
public class GuiaPOO5 extends JFrame {
    public  GuiaPOO5(){
        
        JLabel lbl = new JLabel("Hola");
        add(lbl);
        this.setSize(200,200);
        this.setTitle("JFrame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        GuiaPOO5 guiaPOO5 = new GuiaPOO5();
    }
    
}
