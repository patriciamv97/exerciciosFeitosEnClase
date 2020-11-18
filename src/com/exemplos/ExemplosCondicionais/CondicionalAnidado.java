package com.exemplos.ExemplosCondicionais;

public class CondicionalAnidado {
    public void amosarDatos (String nome, int edade, float peso){
        if (edade>=18){
            if (peso>70){
                System.out.println("nome "+nome+ " ten "+edade+" anos e pesa "+peso);
            }
        }

        System.out.println("O condicional terminó");
    }

}
