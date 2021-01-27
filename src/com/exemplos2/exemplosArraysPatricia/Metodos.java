package com.exemplos2.exemplosArraysPatricia;

import javax.swing.*;
import java.util.Arrays;

public class Metodos {

    public void amosarArrays(float[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println("temperatura " + (i + 1) + " = " + lista[i]);
        }
    }

    public void amosarArraysForEach(float[] lista) {
        for (float tempp : lista) {
            System.out.println("***" + tempp);
        }

    }

    public void ordenar(float[] lista) {
        Arrays.sort(lista);
    }

    //Ordena de menor a mayor
    public void ordenarDirecto(float[] lista) {
        float aux = 0.0f;
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[i] > lista[j]) {
                    aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                }

            }
        }
    }

    public void ordenarDirecto2(float[] lista) {
        float aux = 0.0f;
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[i] < lista[j]) {
                    aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                }

            }
        }
    }

    public void buscarLista(float[] lista, float elemento) {
        int atopado = 0;//non se atopou
        for (int i = 0; i < lista.length; i++) {
            if (elemento == lista[i]) {
                atopado = 1;
                System.out.println("Está na lista");
                break;
            }

        }
        if (atopado==0){
            System.out.println("non está");
        }
    }
    public void buscarLista2(float[] lista, float elemento) {
        int j=0,atopado = 0;//non se atopou
        float[]listarepe=new float[lista.length];
        for (int i = 0; i < lista.length; i++) {
            if (elemento == lista[i]) {
                atopado = 1;
                listarepe[j]= lista[i];
                System.out.println("Está na lista");
                j++;
                break;
            }

        }
        if (atopado==0){
            System.out.println("non está");
        }
        else
            for(int i=0;i<listarepe.length;i++){
                System.out.println("**"+listarepe[i]);
            }
    }
}