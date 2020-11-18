package com.exemplos.ExemploBucles;

import javax.swing.*;

public class BucleWhile {
    /* Ler e visualizar sucesivamente númeors enteiros dende o teclado.
        O proceso remata cando se lea un cero.
     */

    public void verNumeroWhile(){
        int numero;
        numero=lerEntiero();
        while (numero != 0){
            System.out.println(numero);
            numero=lerEntiero();
        }
        System.out.println("Saimos do bucle");
    }
        public int lerEntiero(){
            return Integer.parseInt(JOptionPane.showInputDialog("teclea número"));

        }



    }

