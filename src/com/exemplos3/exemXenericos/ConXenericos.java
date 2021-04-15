package com.exemplos3.exemXenericos;

import java.awt.image.VolatileImage;
import java.util.ArrayList;

public class ConXenericos <T> {
    private T dato;

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
   /* public <T> void amosar(){
        for (Autobus ele: lista){
            System.out.println(lista);
        }

    */


}
