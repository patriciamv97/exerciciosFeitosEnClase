package com.exemplos3.exemXenericos;

public class ConObject {
    Object [] lista =new Object[3];
    public void amosar(Object [] lista) {
        String nome;
        for (int i = 0; i < lista.length; i++) {
            nome = (String) lista[i];//temos que castear
            System.out.println(nome);
            /*nome=(String)lista[i];
            System.out.println(lista[i]);
             */
        }
    }
        public Object [] engadir(){
            lista[0]="aa";
            lista[1]=5;
            lista[2]="cc";
            return lista;
        }
    }

