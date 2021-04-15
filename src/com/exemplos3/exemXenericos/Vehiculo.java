package com.exemplos3.exemXenericos;

public class Vehiculo {
    //Atributos
    private String matricula;
    private String modelo;
    private int potencia; // si no pones acceso visibilidade de paquete
    //Constructores
    public Vehiculo()  {
    }

    public Vehiculo(String matricula, String modelo, int potencia) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    //toString()
    @Override
    public String toString() {
        return "matricula='" + matricula + '\'' + ", modelo='" + modelo + '\'' + ", potencia=" + potencia;
    }
}

