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
public class atividade48 {
    
     public static void main(String[] args) {
        // TODO code application logic here
         double sm, qtdade, preco, vp, vd;
       String s;
       
       s = JOptionPane.showInputDialog ("ENTRE COM O SALÁRIO MÍNIMO:");
       sm = Double.parseDouble(s);
       
       s = JOptionPane.showInputDialog ("ENTRE COM A QUANTIDADE EM QUILOWATT:");
       qtdade = Double.parseDouble(s);
       
       preco = sm / 700;
       vp = preco * qtdade;
       vd = vp * 0.9;
       
       System.out.format("PREÇO DO QUILOWATT: %.2f \nVALOR A SER PAGO: %.2f " , preco, vp);
    }
    
}
