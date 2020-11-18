package com.exemplos.ExemploCoche;

public class Coche {
    private float velocidade;
    private String cor;
    private float prezo;

    public Coche(){

    }

    public Coche(float velocidade, String cor, float prezo) {
        this.velocidade = velocidade;
        this.cor = cor;
        this.prezo = prezo;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    @Override
    public String toString() {
        return "Coche{" + "velocidade=" + velocidade + ", cor=" + cor + ", prezo=" + prezo + '}';
    }


}
