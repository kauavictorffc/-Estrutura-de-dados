/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula09;

/**
 *
 * @author Pichau
 */
import java.util.Random;

public class Lista {
    Cel primeiro, ultimo, removido = new Cel(null);
    int tamanho;

    void addInicio(Object elemento) {
        Cel nova = new Cel(primeiro, elemento);
        this.primeiro = nova;

        if (this.tamanho == 0) {
            ultimo = primeiro;
        }
        this.tamanho++;
    }

    void addFinal(Object elemento) {
        if (this.tamanho == 0) {
            addInicio(elemento);
        } else {
            Cel nova = new Cel(elemento);
            this.ultimo.setProximo(nova);
            this.ultimo = nova;
            this.tamanho++;
        }
    }

    boolean posicaoOcupada(int pos) {
        if ((pos >= 0) && (pos < this.tamanho)) {
            return true;
        } else {
            return false;
        }
    }

    Cel pegarCelula(int pos) {
        if (!this.posicaoOcupada(pos)) {
            throw new IllegalArgumentException("Posiçao nao existe!");
        } else {
            Cel atual = this.primeiro;
            for (int i = 0; i < pos; i++) {
                atual = atual.getProximo();
            }
            return (atual);

        }
    }

    void addMeio(int pos, Object elemento) {
        if (pos == 0) {
            this.addInicio(elemento);
        } else {
            if (pos == this.tamanho) {
                this.addFinal(elemento);
            } else {
                Cel anterior = this.pegarCelula(pos - 1);
                Cel nova = new Cel(anterior.getProximo(), elemento);
                anterior.setProximo(nova);
                this.tamanho++;
            }
        }
    }

    Object pega(int pos) { // Pega o elemento na posição desajada
        return (this.pegarCelula(pos).getElement());
    }
//parei aqui
    void removerInicio() {
        if (!this.posicaoOcupada(0)) {
            throw new IllegalArgumentException("Posição não existe!");
        } else {
            this.primeiro = this.primeiro.getProximo();
            // this.tamanho;
            if (this.tamanho == 0) {
                this.ultimo = null;
            }
        }
    }

    void remover(int pos) {

        if (posicaoOcupada(pos)) {
            if (pos == 0) {
                removido = this.pegarCelula(pos);
                imprimirRemovido();
                removerInicio();
            }
            if ((pos > 0) && (pos < this.tamanho)) {
                removido = this.pegarCelula(pos);
                imprimirRemovido();

                if (pos == tamanho - 1) {
                    Cel anterior = this.pegarCelula(pos - 1);
                    ultimo = anterior;
                }else {
                    Cel proximo = this.pegarCelula(pos + 1);
                    Cel anterior = this.pegarCelula(pos - 1);
                    anterior.setProximo(proximo);
                }

            }

            this.tamanho--;

        } else {
            throw new IllegalArgumentException("Nao eh possivel remover, pois a posicao nao existe!");
        }
    }

    Boolean contem(Object elemento) {
        Cel atual = this.primeiro;

        while (atual != null) {
            if (atual.getElement().equals(elemento)) {
                return true;
            }

            atual = atual.getProximo();
        }
        return false;
    }

    int tamanho() {
        return this.tamanho;
    }

    Random random = new Random();
    int sorteado = 0;

    int x = 20;
//parei aqui
    void sortear() {
        for (int i = 0; i <= 19; i++) {
            System.out.println(" \nrodada " + (i + 1) + "\n");

            if(x == 0){
                sorteado = 0;
            }else {
                sorteado = random.nextInt(x);
            }
            this.remover(sorteado);

            x--;

            for (int j = 0; j < x; j++) {
                Pessoas atual = (Pessoas) pega(j);

                System.out.println("O nome da pessoa eh:" + atual.nome);
                System.out.println("Seu telefone eh: " + atual.telefone);
                System.out.println("Seu endereco eh: " + atual.endereco);
                System.out.println("Seu CPF eh: " + atual.cpf + "\n\n");

            }

        }
    }

    void imprimirRemovido() {
        Pessoas removid = (Pessoas) removido.getElement();

        System.out.println("A pessoa removida eh: " + removid.nome);
        System.out.println("Seu numero eh: " + removid.telefone);
        System.out.println("Seu endereco eh: " + removid.endereco);
        System.out.println("Seu CPF eh: " + removid.cpf + "\n\n\n");
    }

}

