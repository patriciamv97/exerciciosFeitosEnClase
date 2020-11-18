package com.exemplos.ComparadorNumeros;

import java.util.Scanner;

public class ComparadorNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Comparador obx = new Comparador();
        //obx.comparar(2,3);
        System.out.println("Introduce o primer número ");
        double n1 = sc.nextDouble();
        System.out.println("Introduce o segundo número ");
        double n2 = sc.nextDouble();
        obx.comparar(n1,n2);

    }
}
