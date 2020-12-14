package com.exemplos.exemClasesConObxetos1;

public class Pantalla {
    //Atributos
    private float pulgadas;
    //Constructores
    public Pantalla() {
    }

    public Pantalla(float pulgadas) {
        this.pulgadas = pulgadas;
    }
    //Getters and setters
    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "pulgadas=" + pulgadas;
    }
}
