package com.exemplos.ExemploObxeto_1;

public class Rectangulo {
    // atributos
    private float base;
    private float altura;


    //constructores
    public Rectangulo(){

    }
    public Rectangulo (float b, float al){
        base=b;
        altura=al;

    }
    //metodos de acceso getters e setters
    public void setBase(float b){
        base = b;

    }
    public float getBase (){
        return base;
    }

    public void setAltura(float al){
        altura = al;
    }
    public float getAltura(){
        return altura;
    }
    // metodos
    public void amosar(){
        System.out.println("base = " + base + "\naltura = "+ altura);

    }
    public float area(float base, float altura){
        float area;
        area=base*altura;
        System.out.println("area = "+area);
        return area;

    }


}
