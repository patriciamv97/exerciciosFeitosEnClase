package com.exemplos2.exemploNosaExecpcion;

import javax.swing.*;

public class Division2 {

    private int numedaror;
    private int denominador;

    public Division2(){

    }

    public Division2(int numedaror, int denominador) {
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
    public void dividirNosaExcepcion(int nume,int deno) throws NosaExcepcion{
        System.out.println("Antes de propagar a nosa excepcion");
        if(deno==0)
            throw new NosaExcepcion("non dividir un enteiro entre 0");
        else
            System.out.println(nume/deno);
    }
}
