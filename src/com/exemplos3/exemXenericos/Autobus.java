package com.exemplos3.exemXenericos;

import com.exemplos.ExemploHerdanza.Vehiculo;

public class Autobus extends Vehiculo  {
    //Atributo
    private int numeroPlazas;
    //Constructor

    public Autobus() {
    }

    public Autobus(String matricula, String modelo, int potencia, int numeroPlazas) {
        super(matricula, modelo, potencia);
        this.numeroPlazas = numeroPlazas;
    }
    //Getters and setters


    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    @Override
    public String toString() {
        return super.toString() +  " numeroPlazas=" + numeroPlazas;
    }
}
