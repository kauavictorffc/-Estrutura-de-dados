/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java03;
import javax.swing.JOptionPane;

/**
 *
 * @author KauÃ Victor

 */
public class atividade43 {
    
    public static void main(String[] args) {
        // TODO code application logic here
         float num, logaritmo;
        String s;
        
        s = JOptionPane.showInputDialog("Entre com o logaritmo: ");
        num = Float.parseFloat (s);
        
        logaritmo = (float) (Math.log(num)/ Math.log(10));
        System.out.println("Logaritmo: " +logaritmo);
    }
    
}
