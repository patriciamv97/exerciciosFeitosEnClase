package com.exemplos2.exemplosArraysPatricia;

import java.util.Arrays;

public class Metodos {

    public void amosarArrays(float[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println("temperatura " + (i + 1) + " = " + lista[i]);
        }
    }
        public void amosarArraysForEach(float[]lista){
            for(float tempp : lista) {
                System.out.println("***" + tempp);
            }

        }

        public void ordenar(float[]lista){
           Arrays.sort(lista);
    }

}
