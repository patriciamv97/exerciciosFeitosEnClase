package com.exemplos2.exemploArraylistAlumno;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Alumno> listaAlum = new ArrayList();
        String opcion;
        do {
            opcion=JOptionPane.showInputDialog("***Menu***\n1-->Engadir\n2-->Amosar\n3--Consutlar\n4-->Eliminar alumno\n-->Sair");
            switch (opcion){
                case "1": Metodo.engadirElemento(listaAlum);
                break;
                case "2": Metodo.amosar2(listaAlum);
                break;
                case "3": Metodo.consultarForEach(listaAlum);
                break;
                case "4": Metodo.eliminarElemento(listaAlum);
                            Metodo.amosar(listaAlum);
                break;
                case "5": System.exit(0);

            }
        }while (!opcion.equalsIgnoreCase("5"));
    }
}
