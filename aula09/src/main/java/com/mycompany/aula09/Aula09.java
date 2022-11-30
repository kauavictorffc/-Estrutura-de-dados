/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula09;

/**
 *
 * @author kaua
 */
public class Aula09 {
    public static void main(String[] args) throws Exception {
        Pessoas pessoa1 = new Pessoas("1 Mariane Ramos", "(64) 99212-4354", "Travessa Paulino de Almeida", "679.753.820-35");
        Pessoas pessoa2 = new Pessoas("2 Pedro Lucas da Cruz", "(64) 98123-4675", "Beco Basílio Pirro", "028.752.430-20");
        Pessoas pessoa3 = new Pessoas("3 Enzo Santos", "(64) 3413-7452", "Avenida Perimetral Leste", "398.003.810-66");
        Pessoas pessoa4 = new Pessoas("4 Ryan Lopes", "(77) 92342-1245", "Travessa Eugênio de Castro","559.065.200-66");
        Pessoas pessoa5 = new Pessoas("5 Julia Barros", "(33) 98789-0097", "Rua 2, n12, Vila da Folha",  "204.796.040-10");
        Pessoas pessoa6 = new Pessoas("6 Mirella Lopes", "(22) 78078-4567", "Rua Molhada, n23, Fundo do Mar",  "234.432.123-88");
        Pessoas pessoa7 = new Pessoas("7 Cecília Melo", "(11) 99212-0990", "Rua Rio de Janeiro, n23, Centro, Morrinhos-GO", "456.345.433.13");
        Pessoas pessoa8 = new Pessoas("8 João Gabriel Jesus", "(12)0234-2356", "Avenida 101, n147, Setor Aeroporto, Morrinhos-GO", "089.898.345.12");
        Pessoas pessoa9 = new Pessoas("9 Felipe Alves", "(22) 89788-2457", "Avenida Coronel Pedro Nunes, Centro, Morrinhos-GO", "101.299.444.11");
        Pessoas pessoa10 = new Pessoas("10 German Cano", "3413-2244", "Evergreen Terrace, n632, Springfield, Oregon", "111.222.333-44");
        Pessoas pessoa11 = new Pessoas("11 Paulo Henrique", "1111-0809", "Zona rural", "545.346.554-09");
        Pessoas pessoa12 = new Pessoas("12 Richarlison Andrade", "(12) 09879-3455", "Rua das Laranjeiras, n89999999, Setor Verde, Acre", "177.190.650-26");
        Pessoas pessoa13 = new Pessoas("13 Lula Henrique", "4002-8922", "Avenida Central, n233, Centro, Sao Paulo", "446.678.555-12");
        Pessoas pessoa14 = new Pessoas("14 Cristiano Henrique", "(22) 89000-7823", "Rua Trem1, n66, Zona Sul, Rio de Janeiro", "000.000.000-01");
        Pessoas pessoa15 = new Pessoas("15 José Alves", "0000-0001", "Rua das Nuvens, n1, Setor dos Deuses, Monte Olimpo", "101.010.001-10");
        Pessoas pessoa16 = new Pessoas("16 Caramelo da Silva", "1111-1111", "Avenida das Dores, n 90, Setor do Conflito, Sparta", "530.559.800-18");
        Pessoas pessoa17 = new Pessoas("17 Brasil Hexa", "3413-2244", " Rua da Linguica, n69, Setor Sujo, Florida", "098.987.876-65");
        Pessoas pessoa18 = new Pessoas("18 Anderson Silva", "(66) 77889-0344", "Rua Florenca, n21, Morrinhos-GO", "808.847.560-09");
        Pessoas pessoa19 = new Pessoas("19 Leitinho Moco", "4444-4444", "Zona rural", "280.881.840-88");
        Pessoas pessoa20 = new Pessoas("20 Irineu DA Silva", "000-0011", "Rua Rio de Janeiro, n1, Sao Vicente, Sao Paulo", "668.036.250-44");

        Lista lista = new Lista();

        lista.addFinal(pessoa1);
        lista.addFinal(pessoa2);
        lista.addFinal(pessoa3);
        lista.addFinal(pessoa4);
        lista.addFinal(pessoa5);
        lista.addFinal(pessoa6);
        lista.addFinal(pessoa7);
        lista.addFinal(pessoa8);
        lista.addFinal(pessoa9);
        lista.addFinal(pessoa10);
        lista.addFinal(pessoa11);
        lista.addFinal(pessoa12);
        lista.addFinal(pessoa13);
        lista.addFinal(pessoa14);
        lista.addFinal(pessoa15);
        lista.addFinal(pessoa16);
        lista.addFinal(pessoa17);
        lista.addFinal(pessoa18);
        lista.addFinal(pessoa19);
        lista.addFinal(pessoa20);

        lista.sortear();
        System.out.println(lista.tamanho);

    }
}