package com.exemplos.ExemplosCondicionais;

public class CondicionalDobre {
    public void comparar (int edade){
        if (edade >= 18){
            System.out.println("é maior de edade ");
        }
        else {
            System.out.println("é menor de edade ");
        }

        System.out.println("remato o condicional");
    }
    public void operadorInterrogante(int edade){
        String mensaxe = (edade >= 18)? "é maior": "é menor";
        System.out.println(mensaxe);
    }
}
