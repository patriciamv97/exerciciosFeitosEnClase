package com.exemplos2.exemploArraylistAlumno;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Metodo {

    public static void engadirElemento(ArrayList<Alumno>listaAlum){
        Alumno ele= perdirALumnado("Alumno a engadir :");
        listaAlum.add(ele);
    }


    public static Alumno perdirALumnado(String mensaxe){
       String nome= JOptionPane.showInputDialog("nome :");
       int nota=Integer.parseInt(JOptionPane.showInputDialog("nota :"));
       String dni=JOptionPane.showInputDialog("dni :");
       Alumno al= new Alumno(nome,dni,nota);
       return al;
    }
    public static void amosar(ArrayList<Alumno>listaAlum){
        for (Alumno ele: listaAlum){
            System.out.println(ele);
        }
    }
    public static void amosar2(ArrayList<Alumno>listaAlum){
        for (int i =0; i<listaAlum.size();i++){
            System.out.println(listaAlum.get(i));
        }
    }

    public static void consultar(ArrayList<Alumno>listaAlum) {
        int atopado = 0;
        String dni = JOptionPane.showInputDialog("Introduce o dni do alumno :");
        for (int i = 0; i < listaAlum.size(); i++) {
            if (dni.equalsIgnoreCase(listaAlum.get(i).getDni())) {
                atopado = 1;
                System.out.println("Nome : "+listaAlum.get(i).getNome()+" nota : "+listaAlum.get(i).getNota()+" dni : "+listaAlum.get(i).getDni());
            }

        }
        if (atopado == 0) {

            System.out.println("O alumno non está na lista.");
        }
    }

    public  static  void consultarForEach(ArrayList<Alumno>listaAlum){
        String dni = JOptionPane.showInputDialog("Introduce o dni do alumno :");
        int atopado=0;
        for (Alumno al :listaAlum){
            if (al.getDni().equalsIgnoreCase(dni)){
                System.out.println("Nome : "+al.getNome()+" nota : "+al.getNota()+" dni : "+al.getDni());
                atopado=1;
            }
        }

        if (atopado==0){
            System.out.println("O alumno non está na lista.");
        }
    }

    public static void eliminarElemento(ArrayList<Alumno>listaAlum){
       boolean atopado=false;
        Iterator it = listaAlum.iterator();
        String dni = JOptionPane.showInputDialog("Introduce o dni do alumno :");
          while(it.hasNext()){ //dice si hay elementos en la lista
              Alumno al = (Alumno)it.next();//el next devuelve un elemento de tipo object
              //if(al.getDni().equalsIgnoreCase(dni))
                if (((Alumno) it.next()).getDni().equalsIgnoreCase(dni)){
                    it.remove();
                    atopado=true;
                }
            }
          if (atopado==false){
              System.out.println("Non está na lista");
          }
    }
}
