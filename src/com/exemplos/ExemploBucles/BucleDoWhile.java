package com.exemplos.ExemploBucles;

import javax.swing.*;

public class BucleDoWhile {
    public void verNumeroDoWhile(){
        int numero;
        do {
            numero = lerEntiero("teclea numero");
            if (numero != 0)
                System.out.println(numero);
        }while (numero != 0);
        System.out.println("Saimos do do...while");
    }
    public int lerEntiero(String mensaxe){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));

    }
}
