package com.exemplos2.exemplomatriz;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
         String opcion = "";
         MetodosMatrices metodosMatrices = new MetodosMatrices();
        do {
            opcion=JOptionPane.showInputDialog("Menu\n1)Crear Matriz\n2)amosar\n3)Media alumno\n4)FIN");
            switch (opcion){
                case "crear": metodosMatrices.crearMatriz();
                                break;
                case "amosar": metodosMatrices.amosar(metodosMatrices.notas);
                                break;
                case "media": metodosMatrices.notaMediaAlumno(metodosMatrices.notas);
                                break;
                case "mediamodulo": metodosMatrices.mediaModulo(metodosMatrices.notas);
                case "fin": System.exit(0);
            }
        }while(opcion.equalsIgnoreCase("fin")==false);
    }
}
