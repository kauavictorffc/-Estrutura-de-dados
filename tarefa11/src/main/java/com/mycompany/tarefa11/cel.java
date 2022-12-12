/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarefa11;

/**
 *
 * @author Pichau
 */
public class cel {
    
   char caracter;
    cel anterior;
    
    cel(){
    }
    
    public cel(char caracter, cel anterior){
        this.caracter = caracter;
        this.anterior = anterior;
    }
    
    char getDado(){
        return this.caracter;
    }
    
    void setDado(char caracter){
        this.caracter = caracter;
    }

    cel getAnterior() {
        return this.anterior;
    }

    void setAnterior(cel anterior) {
        this.anterior = anterior;
    } 
}
