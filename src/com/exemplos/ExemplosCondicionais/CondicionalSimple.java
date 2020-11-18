package com.exemplos.ExemplosCondicionais;

public class CondicionalSimple {
    private int edade ;

    public CondicionalSimple() {
    }

    public CondicionalSimple(int edade) {
        this.edade = edade;
    }

    public void maiorEdade(int edade){
        //Si solo tengo unha sentencia tenfo que utilizar unha chave
        if (edade >= 18){
            System.out.println("é maior de edade");
            System.out.println(" dentro do condicional");
        }

        System.out.println("remata o condicional"); // esta fora do programa
    }
}
