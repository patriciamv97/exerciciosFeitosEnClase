package com.exemplos3.exemploGUI.patri.eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Evento implements ActionListener {

    JFrame marco;
    JPanel panel;
    JButton bLimpar, bEscribe;
    JLabel etiqueta;
    JTextField LtextoNome;
    JTextArea aTexCopia;

    public void iniciar(){

        //Instanciamos as compoñentes
        marco=new JFrame("MARCO CON COMPOÑENTES");
        panel=new JPanel();
        bLimpar=new JButton("Borra");
        bEscribe=new JButton();
        LtextoNome=new JTextField();
        aTexCopia=new JTextArea();
        etiqueta=new JLabel("Nome :");

        //Damoslle as caracteristicas das compoñentes

        marco.setSize(800,800);
        panel.setSize(750,750);
        panel.setLayout(null); //Anulamos la distrubucion de los componentes por defecto del panel
        bLimpar.setBackground(Color.cyan);
        bLimpar.setBounds(500,600,100,50);
        bEscribe.setBounds(200,600,100,50);
        bEscribe.setText("Esc");
        bEscribe.setToolTipText("copia o que temos na liña de texto na area do texto ");
        LtextoNome.setBounds(400,100,100,25);
        aTexCopia.setBounds(350,300,200,300);
        etiqueta.setBounds(200,100,50,150);


        //engadimos compoñentes

        panel.add(etiqueta);
        panel.add(LtextoNome);
        panel.add(aTexCopia);
        panel.add(bEscribe);
        panel.add(bLimpar);

        //Xestion de eventos

        bEscribe.addActionListener(this);
        bLimpar.addActionListener(this);

        marco.add(panel);
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==bEscribe) {
            aTexCopia.setText(LtextoNome.getText());
        }else {
            aTexCopia.setText("");
            LtextoNome.setText("");
        }
    }
}
