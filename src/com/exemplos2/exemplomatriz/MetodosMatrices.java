package com.exemplos2.exemplomatriz;

import javax.swing.*;

public class MetodosMatrices {
    int [][] notas;
    String []ListaNomes=new String[Integer.parseInt(JOptionPane.showInputDialog("Introduce cantidad de alumnos"))];

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
        crearListaNomes();
        for (int i=0; i<taboa.length;i++){
            System.out.println("\n");
            System.out.print(ListaNomes[i]+"   ");
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
    public void mediaModulo(int[][]taboa) {
        int acumulador = 0;
        for (int columna = 0; columna < taboa.length; columna++) {
            acumulador = 0;
            for (int fila = 0; fila < taboa[columna].length; fila++) {
                acumulador = acumulador + taboa[fila][columna];
            }
            System.out.println("\n" + acumulador / taboa.length);
        }

       /*
                         for (int i =0; i<taboa.length;i++){
                         acumulador=0;
                         for (int j=0;j<taboa[i].length;j++){
                         acumulador=acumulador+taboa[j][i];
                         }
                         System.out.println("**"+acumulador/taboa.length); */
    }

    public void ordenaNotas(int[][]taboa,String[] listaNomes, int[][]notasMedias){

    }

    public void crearListaNomes(){
        for (int i=0; i< ListaNomes.length;i++){
            ListaNomes[i]=JOptionPane.showInputDialog("Introduce o nome do alumno :");
        }

    }


}
