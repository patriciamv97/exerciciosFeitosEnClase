package com.exemplos3.exemArrayListXenericos;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

public class ListaNumeros <T>{
   // ArrayList <Integer> listaNumeros = new ArrayList<>();

    public void amosarForEach(ArrayList<T>lista) {
        for (T elemento : lista)
            System.out.println("* " + elemento);

    }
/*
    public void eliminar(){
        int elementoEliminar=Integer.parseInt(JOptionPane.showInputDialog("Introduzca o elemento que desexe eliminar"));
        for (int i=0; i<listaNumeros.size();i++){
            if (elementoEliminar==listaNumeros.get(i)){
             listaNumeros.remove(i);
             }
         }
    }

    public void añadirNumeroPosicion(int pos){
        int elemento=Integer.parseInt(JOptionPane.showInputDialog("Introduce o elemento que quere engadir"));
        listaNumeros.add(pos,elemento);
    }

    public void eliminarMultiplos2(){
        Iterator it = listaNumeros.iterator();
        while (it.hasNext()){
            if ((int)it.next()%2==0){
                it.remove();
            }
        }
    }



    public void eliminarMultiplis(){
        for (int i=0; i<=listaNumeros.size();i++){
            if ((listaNumeros.get(i)%2)==0) {
                    listaNumeros.remove(i);
            }
        }
    }


    public void multiplicar(){
        Integer ele;
        for (int i=0; i<listaNumeros.size();i++){
            ele = listaNumeros.get(i)*3;
            listaNumeros.remove(i);
            listaNumeros.add(i,ele);

            }
        }


 */


















}
