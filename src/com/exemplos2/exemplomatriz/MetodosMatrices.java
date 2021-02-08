package com.exemplos2.exemplomatriz;

import javax.swing.*;

public class MetodosMatrices {

    int [][] notas;

    public int [][] crearMatriz(){
    //Utilizar libreria creada
    int fila = Integer.parseInt(JOptionPane.showInputDialog("Introduce o numero de filas"));
    int columna = Integer.parseInt(JOptionPane.showInputDialog("Introduce o numero de columna"));
    notas=new int[fila][columna];
    for (int i=0;i<fila;i++) {
        for (int j = 0; j < columna; j++) {
        notas[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Introduce a nota"));
        }
    }
    return notas;
    }

    public void amosar(int[][]taboa){
        for (int i=0; i<taboa.length;i++){
            System.out.println("\n");
            for (int j=0; j<taboa[i].length;j++){
                System.out.print(taboa[i][j]+"  ");
            }
        }
    }
    public void notaMediaAlumno(int[][]taboa){
        int acumulador=0;
        for (int i =0; i<taboa.length;i++){
             acumulador=0;
            for (int j=0;j<taboa[i].length;j++){
                acumulador=acumulador+taboa[i][j];
            }
            System.out.println("**"+acumulador/taboa[i].length);
        }

    }
    public void mediaModulo(int[][]taboa){
        int acumulador=0;
        for (int i=0; i<taboa.length;i++){
            acumulador=0;
            for (int j=0; j<taboa[i].length;j++){
                acumulador=acumulador+taboa[j][i];
            }
            System.out.println("\n"+acumulador/taboa[i].length);
        }
    }

}
