package com.exemplos.exemClasesConObxetos1;

public class Ordenador {
    //Atributos
    private float prezo;
    private Cpu cpu ;
    private Pantalla pantalla ;
    private Rato rato ;// Declara pero non ten espazo en memoria



    public Ordenador() {
        cpu = new Cpu();
        pantalla = new Pantalla();
        rato = new Rato();
    }

    public Ordenador(float prezo, Cpu c, Pantalla p, Rato ra) {
        cpu = new Cpu();
        pantalla = new Pantalla();
        rato = new Rato(); // Si ponemos Rato rato = new Rato(); estamos creando un nuevo obxeto con distinta direccion de memoria ca anterior
        this.prezo = prezo;
        cpu= c;
        pantalla= p;
        rato=ra;

    }
    public Ordenador (float prezo, float velocidade, String marca, float pulgadas, String conexion){
        cpu = new Cpu(velocidade,marca);
        pantalla = new Pantalla(pulgadas);
        rato = new Rato(conexion);
        this.prezo=prezo;

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
