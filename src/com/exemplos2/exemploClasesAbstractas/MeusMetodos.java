package com.exemplos2.exemploClasesAbstractas;

import javax.swing.*;

public class MeusMetodos {
    public static float lerFloatPositivo(String mensaxe) {
        float resposta;
        do {
            resposta = Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
        } while (resposta <= 0);
        return resposta;
    }
}