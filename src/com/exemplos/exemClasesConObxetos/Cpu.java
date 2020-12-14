package com.exemplos.exemClasesConObxetos;

public class Cpu {
    private float velocidade;
    private String marca;

    public Cpu() {
    }

    public Cpu(float velocidade, String marca) {
        this.velocidade = velocidade;
        this.marca = marca;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "velocidade=" + velocidade + ", marca=" + marca;
    }
}
