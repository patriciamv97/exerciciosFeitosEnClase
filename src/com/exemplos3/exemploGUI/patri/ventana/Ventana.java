package com.exemplos3.exemploGUI.patri.ventana;

import javax.swing.*;

public class Ventana {
    JFrame marco;
    public void iniciar(){
        marco = new JFrame("PRIMERA VENTANA");
        //Visualizamos la ventana
        marco.setVisible(true);
        //Damoslle as caracteristicas a ventana
        marco.setSize(800,600);
        //Para parar a execucion cando se lle da a x da ventana
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Colocame no centro en vez de no punto (0,0)
        marco.setLocationRelativeTo(null);
    }
}
