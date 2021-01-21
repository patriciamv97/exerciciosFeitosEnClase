package com.exemplos2.exemploNosaExecpcion;

public class NosaExcepcion extends Exception {
    public NosaExcepcion() {
        super();
    }

    public NosaExcepcion(String message) {
        super("Tes un erro " + message);
    }
}
