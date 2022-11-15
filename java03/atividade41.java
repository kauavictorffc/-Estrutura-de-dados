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
public class atividade41 {
    
    public static void main(String[] args) {
        // TODO code application logic here
          int a, b, c, d, mp;
        String s;
        
        s = JOptionPane.showInputDialog ("Entre com 1 numero: ");
        a = (int) Float.parseFloat(s);
        
        s = JOptionPane.showInputDialog("Entre com 2 numeros: ");
        b = (int) Float.parseFloat(s);
        
        s = JOptionPane.showInputDialog("Entre com 3 numeros: ");
        c = (int) Float.parseFloat(s);
        
        s = JOptionPane.showInputDialog("Entre com 4 numeros: ");
        d = (int) Float.parseFloat(s);
        
        mp = (a*1 + b*2 + c*3 + d*4)/10;
        System.out.println("Media Emponderada: " +mp);
    }
    
}
