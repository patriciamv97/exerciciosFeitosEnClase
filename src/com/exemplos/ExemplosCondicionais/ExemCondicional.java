package com.exemplos.ExemplosCondicionais;

import javax.swing.*;

public class ExemCondicional {
    public static void main(String[] args) {
        /* CondicinalSimple obx = new CondicinalSimple();
        obx.maiorEdade(25);*/

        //CondicionalDobre obx2 = new CondicionalDobre ();
        // obx2.comparar(25);
        //  obx2.comparar(12);

        // obx2.operadorInterrogante(2);

   /* Metodos obx = new Metodos();
    int edade=obx.pedirInt();
    float peso=obx.pedirFloat();
    String nome=obx.pedirString();
    CondicionalAnidado obxAni = new CondicionalAnidado();
    obxAni.amosarDatos(nome, edade, peso);*/

        CondicionalMultiple obx1 = new CondicionalMultiple();
        int num = Integer.parseInt(JOptionPane.showInputDialog("Teclea dia : "));
        obx1.amosarDiaSemana(num);
        //obx1.amosarDiaSemana2(num);

    }

}

