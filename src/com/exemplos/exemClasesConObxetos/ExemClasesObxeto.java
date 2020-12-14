package com.exemplos.exemClasesConObxetos;

import javax.swing.*;

public class ExemClasesObxeto {
    public static void main(String[] args) {
        float prezo = lerFloat("Teclea prezo : ");
        float pulgadas = lerFloat("Teclea pulgadas");
        String marca = lerString("Teclea a marca :");
        String conexion = lerString("conexion :");
        float velocidade = lerFloat("Velocidade :");

        Cpu c = new Cpu(velocidade,marca);
        Pantalla p = new Pantalla(pulgadas);
        Rato r = new Rato(conexion);

        Ordenador obx = new Ordenador(prezo,c,p,r);
        // Ordenador obx = new Ordenador (prezo, new Cpu (valocidade,marca), new Rato ( lerString("conexion :")))
        System.out.println(obx);
        velocidade=lerFloat("velocidade");
        obx.getCpu().setVelocidade(velocidade);
       // obx.getCpu().setVelocidade(lerFloat("velocidade"));
        System.out.println(obx.toString());


    }
    public static String lerString(String mensaxe){
       return JOptionPane.showInputDialog(mensaxe);
    }
    public static float lerFloat(String mensaxe){
        return Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
    }
}
