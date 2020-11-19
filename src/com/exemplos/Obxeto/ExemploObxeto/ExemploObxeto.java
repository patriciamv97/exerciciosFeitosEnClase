package com.exemplos.Obxeto.ExemploObxeto;

public class ExemploObxeto {
    public static void main(String[] args) {
        Rectangulo obxRec1 = new Rectangulo();
        float altura = obxRec1.altura;
        System.out.println("altura --- "+altura); //miramos altura por ser pblic
        obxRec1.amosar();
        System.out.println("altura -> " +obxRec1.altura);

    }
}
