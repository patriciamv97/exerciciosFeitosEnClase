package com.exemplos2.exemploExcepcions;

public class Main {
    public static void main(String[] args) {

        Division obxDiv = new Division();
        try {
            obxDiv.dividirPropagandoExcepcion(8, 0);
        }catch (ArithmeticException e){
            System.out.println(e.toString());
        }
    }
}
