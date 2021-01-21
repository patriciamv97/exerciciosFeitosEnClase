package com.exemplos2.exemploExcepcions;

import javax.swing.*;

public class Division {

    private int numedaror;
    private int denominador;

    public Division(){

    }

    public Division(int numedaror, int denominador) {
        this.numedaror = numedaror;
        this.denominador = denominador;
    }

    public void dividirSenCapturarExcep(int den, int num){

        System.out.println("resultado sen tratar excepcions "+ num/den);

    }
    public  void  dividirCapturandoExcep( int deno){
        try {
            System.out.println("Antes da división");
            int nume = Integer.parseInt(JOptionPane.showInputDialog("numerador"));
            System.out.println("resultado  tratatando excepcions " + nume / deno);
            System.out.println("Despois da división");
        }catch (ArithmeticException e){
            System.out.println("erro1" +e.toString());
        }catch (Exception e){
            System.out.println("erro2 " + e.getMessage());
        }
   }
    public  void  dividirUsandoFinally(int nume, int deno){
        try {
            System.out.println("Antes da división");
            System.out.println("resultado  tratatando excepcions " + nume / deno);
            System.out.println("Despois da división");
        }catch (ArithmeticException e){
            System.out.println("erro1" +e.toString());
        }finally {
            System.out.println("Bloque que sempre se executa");
        }
    }
    public void dividirPropagandoExcepcion(int num, int den)throws ArithmeticException{
        System.out.println("Antes de propagar");
        if (den==0)
            throw new ArithmeticException("No dividir entre 0");
        else
            System.out.println(num/den);

    }
}
