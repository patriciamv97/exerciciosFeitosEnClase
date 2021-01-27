package com.exemplos2.exemploArrays;


import com.exemplos2.exemplosArraysPatricia.Metodos;


public class Main {
    public static void main(String[] args) {
        float[] temperaturas = {8, 10, 12, 3.5f, 5};
        Metodos obxMetodos = new Metodos();
        //obxMetodos.amosarArrays(temperaturas);
        System.out.println("Lista ordenada");
        //obxMetodos.ordenar(temperaturas);
        //obxMetodos.amosarArrays(temperaturas);
        obxMetodos.ordenarDirecto2(temperaturas);
        obxMetodos.amosarArrays(temperaturas);
        obxMetodos.buscarLista(temperaturas,12);

    }
}