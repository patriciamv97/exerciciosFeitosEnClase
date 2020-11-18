package com.exemplos.ComparadorNumeros;

public class Comparador {
    public void comparar (double n1 , double n2){
        String mensaxe = (n1>n2)? n1+" é maior que "+n2 : n1+" é menor que "+n2;
        System.out.println(mensaxe);
    }
}
