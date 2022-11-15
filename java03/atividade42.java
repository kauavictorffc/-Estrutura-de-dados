/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java03;
import static java.lang.Math.sin;
import javax.swing.JOptionPane;

/**
 *
 * @author Kauã Victor
 */
public class atividade42 {
    
     public static void main(String[] args) {
        // TODO code application logic here
         float angulo, rang;
        String s;
        
        s = JOptionPane.showInputDialog("digite um angulo em graus: ");
        angulo = Float.parseFloat(s);
        
        rang = (float) (angulo * Math.PI / 180);
        
        System.out.println("Seno: " +Math.sin(rang));
        System.out.println("Co/seno: " +Math.cos(rang));
        System.out.println("Tangente: " +Math.tan(rang));
        System.out.println("Co/Secante: " +1/Math.sin(rang));
        System.out.println("Secante: " +1/Math.cos(rang));
        System.out.println("Contangente: " +1/Math.tan(rang));
    }
    
}
