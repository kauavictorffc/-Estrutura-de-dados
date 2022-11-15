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
public class atividade46 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          double saldo, nsaldo;
        String s;
        
        s = JOptionPane.showInputDialog("Informe o Saldo:");
        saldo = Double.parseDouble(s);
        
        nsaldo = saldo * 1.01;
        System.out.println("O novo saldo:.. " +nsaldo);
    }
    
}
