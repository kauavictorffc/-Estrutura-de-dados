/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula09;

/**
 *
 * @author Pichau
 */
public class Cel {
    Cel proximo;
    Object elemento;
    
    public Cel(Object elemento){
        this.elemento = elemento;
    }
    public Cel(Cel proximo, Object elemento){
        this.proximo = proximo;
        this.elemento = elemento;
    }

    void setProximo(Cel proximo){
        this.proximo = proximo;
    }

    Cel getProximo(){
        return this.proximo;
    }

    Object getElement(){
        return this.elemento;
    }

}

