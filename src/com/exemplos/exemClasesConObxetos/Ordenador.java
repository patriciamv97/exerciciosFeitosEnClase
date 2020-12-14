package com.exemplos.exemClasesConObxetos;

public class Ordenador {
    //Atributos
    private float prezo;
    private Cpu cpu = new Cpu();
    private Pantalla pantalla = new Pantalla();
    private Rato rato = new Rato();

    public Ordenador() {
    }

    public Ordenador(float prezo, Cpu cpu, Pantalla pantalla, Rato rato) {
        this.prezo = prezo;
        this.cpu = cpu;
        this.pantalla = pantalla;
        this.rato = rato;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public Rato getRato() {
        return rato;
    }

    public void setRato(Rato rato) {
        this.rato = rato;
    }

    @Override
    public String toString() {
        return "prezo=" + prezo + ", cpu=" + cpu + ", pantalla=" + pantalla + ", rato=" + rato;
    }
}
