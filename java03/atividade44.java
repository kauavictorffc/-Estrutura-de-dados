/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java03;
import javax.swing.JOptionPane;
/**
 *
 * @author Kauã Victor
 */
public class atividade44 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        double num, base, logaritmo;
        String s;
       
        s = JOptionPane.showInputDialog("Entre com o logaritmo:");
        num = Double.parseDouble(s);
        
        s = JOptionPane.showInputDialog("Entre com a base:");
        base = Double.parseDouble(s);
        
        logaritmo = Math.log (num) / Math.log(base);
        System.out.format("O logaritmo de %.2f, na base %.2f eh %.2f", num, base,logaritmo);
    }
    
}
