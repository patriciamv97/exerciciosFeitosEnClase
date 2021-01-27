package com.exemplos2.exemploClasesAbstractas;

public class Main {

    public static void main(String[] args) {
        float ba = MeusMetodos.lerFloatPositivo("Teclee a base");
        float al = MeusMetodos.lerFloatPositivo("Teclee a altura");
        Triangulo tri = new Triangulo(ba,al);
        System.out.println("Area = " + tri.calcularArea());
        float ba1 = MeusMetodos.lerFloatPositivo("Teclee a base");
        float al1 = MeusMetodos.lerFloatPositivo("Teclee a altura");
        Rectangulo re = new Rectangulo(ba1 ,al1);
        System.out.println("Area = "+ re.calcularArea() +"\nPerimetro = "+ re.calcularPerimetro() );
        //Poligono obxPol = new Poligono(ba,al); Non se pode instanciar un obxeto dunha clase abstracta
        Poligono obxRec = new Rectangulo(ba1,al1); // Estamos instanciando o creando un obxeto rectangulo de tipo poligono
        System.out.println("Area = "+obxRec.calcularArea());

    }
}
