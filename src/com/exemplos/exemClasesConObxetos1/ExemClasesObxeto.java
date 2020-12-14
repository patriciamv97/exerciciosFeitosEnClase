package com.exemplos.exemClasesConObxetos1;

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

        Ordenador obx = new Ordenador(prezo,velocidade,marca,pulgadas,conexion);
        System.out.println(obx);
        obx.getRato().setConexion("Inhalambrico");
        System.out.println(obx);

        if (obx.getPantalla().getPulgadas() < 14){
            obx.getPantalla().setPulgadas(15.5f);
        System.out.println(obx);}





    }
    public static String lerString(String mensaxe){
       return JOptionPane.showInputDialog(mensaxe);
    }
    public static float lerFloat(String mensaxe){
        return Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
    }
}
