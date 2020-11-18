package com.exemplos.PracticaCondicional;

public class MetodosPracticaCondicional {
    public void valorar(int edade) {
        if (edade > 14) {
            if (15 <= edade & edade <= 18) {
                System.out.println("Adolescente");
            } else if (edade >= 19 & edade <= 30) {
                System.out.println("Xoven");

            } else System.out.println("Adulto");

        } else
            System.out.println("Neno");

        System.out.println("Remata o condicional");

    }

}

