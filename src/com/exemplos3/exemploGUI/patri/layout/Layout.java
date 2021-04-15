package com.exemplos3.exemploGUI.patri.layout;

import javax.swing.*;
import java.awt.*;

public class Layout {
    JFrame marco;
    JPanel panel;
    JButton boton1, boton2, boton3, boton4, boton5;

    public void iniciar() {
        marco = new JFrame("distribuidor compoñentes");
        panel = new JPanel();
        marco.pack(); //Axusta o marco aos compoñentes que teña
        boton1 = new JButton("BOTON1");
        boton2 = new JButton("BOTON2");
        boton3 = new JButton("BOTON3");
        boton4 = new JButton("BOTON4");
        boton5 = new JButton("BOTON5");

        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 4, 2));
        // panel.setLayout(new FlowLayout(JButton.LEFT,2,4));
    }

    /*  public void examFlowLayou(){
          panel.add(boton1);
          panel.add(boton2);
          panel.add(boton3);
          panel.add(boton4);
          panel.add(boton5);
          marco.add(panel);
      }

     */
      /*  public void exemBoxLayout(){
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
            panel.add(boton1);
            panel.add(boton2);
            panel.add(boton3);
            panel.add(boton4);
            panel.add(boton5);
            marco.add(panel);
        }

       */
    public void BorderLayout() {
        panel.setLayout(new BorderLayout());
        panel.add(boton1, BorderLayout.NORTH);
        panel.add(boton2, BorderLayout.SOUTH);
        panel.add(boton3, BorderLayout.CENTER);
        panel.add(boton4, BorderLayout.EAST);
        panel.add(boton5, BorderLayout.WEST);
        marco.add(panel);
    }
    public void exemGridLayout(){
        panel.setLayout(new GridLayout(2,3));
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);

    }
    public void pecharVentana() {

        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);


    }

}


