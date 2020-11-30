package com.exemplos.Override;

import java.util.Scanner;

public class ExemploObxeto1 {
    public static void main(String[] args) {
    //instancio un obxecto tipo Rectangulo
    Scanner sc= new Scanner(System.in);
    Rectangulo obxRec1 = new Rectangulo();
    // obxRec1.amosar();
    Rectangulo obxRec2= new Rectangulo(3f,5f);
    //   obxRec2.amosar();
    float r=obxRec2.getAltura();
    // System.out.println("altura = "+ r);
      obxRec1.setBase(10f);
      obxRec1.setAltura(11f);
      obxRec1.amosar();
      System.out.println("base =");
    float ba= sc.nextFloat();
      System.out.println("altura =");
    float alt = sc.nextFloat();
    Rectangulo obxR= new Rectangulo();
    float res = obxR.area(ba, alt);
    //System.out.println("area = "+ res);
}
}
