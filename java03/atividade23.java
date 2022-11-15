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
public class atividade23 {
    
     public static void main(String[] args) {
        
        int a, d;
        String s;
        
        s = JOptionPane.showInputDialog ("Digite o numero de tres casas:");
        a = (int) Float.parseFloat(s);
        
        d = a % 100 / 10 ;
        System.out.println("Algarismos da casa das dezenas" +d);
    }
    
    
}
