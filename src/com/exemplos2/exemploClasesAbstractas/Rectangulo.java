package com.exemplos2.exemploClasesAbstractas;

public class Rectangulo extends Poligono {
    public Rectangulo(float base, float altura) {
        super(base, altura);
    }

    public float calcularArea(){
        return super.getAltura()*super.getBase();
    }
    public float calcularPerimetro(){
        return super.getAltura()*2+super.getBase()*2;
    }
}
