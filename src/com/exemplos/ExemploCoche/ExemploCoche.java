package com.exemplos.ExemploCoche;

import java.util.Scanner;

public class ExemploCoche {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Coche oxc1= new Coche (220,"verde",12000);
        System.out.println(oxc1.toString());
        System.out.println(oxc1);
        Coche oxc2 = new Coche ();
        System.out.println("Introduce a velocidade  = ");
        float  velocidade =sc.nextFloat();
        System.out.println("Introduce a cor  = ");
        String cor = sc.next();
        System.out.println("Introduce o prezo  = ");
        float  prezo =sc.nextFloat();
        oxc2.setVelocidade(velocidade);
        oxc2.setCor(cor);
        oxc2.setPrezo(prezo);
        System.out.println(oxc2.toString());

    }
}
