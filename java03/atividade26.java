/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java03;
import javax.swing.JOptionPane;

/**
 *
 * @author Pichau
 */
public class atividade26 {
    
    public static void main(String[] args) {
        // TODO code application logic here
         int data, dia, mes, ano, ndata;
        String s;
        
       s = JOptionPane.showInputDialog("Digite sua data de nascimento em formato DDMMAA:.");
       data = (int) Float.parseFloat(s);
       
       dia = data / 10000;
       System.out.println("Dia: " +dia);
       
       mes = data % 10000 / 100;
       System.out.println("Mes:.." +mes);
       
       ano = data % 100;
       System.out.println("Ano:.. " +ano);
       
       ndata = mes * 10000 + dia*100+ano;
       System.out.println("Data no formato MMDDAA:.. " +ndata);
    }
    
}
