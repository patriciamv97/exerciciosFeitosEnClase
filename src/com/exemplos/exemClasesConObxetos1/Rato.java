package com.exemplos.exemClasesConObxetos1;

public class Rato {
    //Atributos
    String conexion;
    //Constructor
    public Rato() {
    }

    public Rato(String conexion) {
        this.conexion = conexion;
    }
    //Getters y setters
    public String getConexion() {
        return conexion;
    }

    public void setConexion(String conexion) {
        this.conexion = conexion;
    }

    @Override
    public String toString() {
        return "conexion=" + conexion;
    }
}
