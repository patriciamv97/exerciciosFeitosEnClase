package com.exemplos.PracticaCondicional;

import javax.swing.*;

public class Metodos {
    public static int pedirInt(){
        String reposta = JOptionPane.showInputDialog("Teclea edade : ");
        int valor = Integer.parseInt(reposta);
        return valor;
    }
    public static int pedirInt2(){
        int valor = Integer.parseInt(JOptionPane.showInputDialog("    edade : "));
        return valor;
        /*
        return Integer.parseInt(JOptionPane.showInputDialog("     edade :));
        */
    }
    public static Float pedirFloat(){
        return Float.parseFloat(JOptionPane.showInputDialog("Teclee peso : "));
    }
    public static  String pedirString (){
        return JOptionPane.showInputDialog("tecle nome ");
    }
}
