package com.exemplos3.exemploGUI.patri.ventana;

import javax.swing.*;

public class VentanaJPanel extends JFrame {

    public void iniciar() {
        setTitle("PRIMEIRA VENTAMA");
        //Visualizamos la ventana
        this.setVisible(true);
        //Damoslle as caracteristicas a ventana
        this.setSize(800, 6000);
        //setSize(800,600);
        //Para parar a execucion cando se lle da a x da ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Colocame no centro en vez de no punto (0,0)
        this.setLocationRelativeTo(null);
    }
}
