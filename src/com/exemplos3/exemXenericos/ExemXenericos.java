package com.exemplos3.exemXenericos;

import com.exemplos2.ExemploArrayList.ListaNumeros;

import java.util.ArrayList;
import java.util.List;

public class ExemXenericos {
    public static void main(String[] args) {
     /*   ConObject obx = new ConObject();
        String[] lista1 = {"aa", "cc"};
        // Integer[]lista2={1,2,3,4};
       // obx.amosar(lista1);
        //obx.amosar(lista2);
        //String[] lista3 = new String[3];
        Object[] lista4 = obx.engadir();
        obx.amosar(lista4);

      */
      /*  ConXenericos <String>obx =new ConXenericos();
        obx.setDato("3");
        System.out.println(obx.getDato());

       */
        ConXenericos<Autobus> ob =new ConXenericos<>();
        ob.setDato(new Autobus("aadd","aa",200,5));
        System.out.println(ob.getDato());

        ConXenericos<Vehiculo> ob1 = new ConXenericos<>();
        ob1.setDato(new Vehiculo("aa","citroen",220));
        System.out.println(ob1.getDato());

       // ArrayList<?extends Vehiculo> l= new ArrayList<Autobus>(); //Calquera que extenda de vehiculo
       // List< ? extends Vehiculo> l=new ArrayList<Autobus>();
    }
}
