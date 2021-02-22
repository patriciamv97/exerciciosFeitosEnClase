package com.exemplos2.exemploArraylistAlumno;

public class Alumno implements Comparable<Alumno> {
    private String nome;
    private String dni;
    private int nota;

    public Alumno() {
    }

    public Alumno(String nome, String dni, int nota) {
        this.nome = nome;
        this.dni = dni;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return
                "nome=" + nome + '\'' +
                ", dni=" + dni + '\'' +
                ", nota=" + nota ;
    }

    @Override
    public int compareTo(Alumno alumno) {
        //puedes poner tambien alumno.getDni() en vez de alumno.dni
        if ((this.dni.compareToIgnoreCase(alumno.dni))>0){
            return 1;
        }
        else if ((this.dni.compareToIgnoreCase(alumno.dni))<0){
            return -1;
        }
        else
            return 0;
    }


}
