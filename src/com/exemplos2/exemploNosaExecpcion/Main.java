package com.exemplos2.exemploNosaExecpcion;

import com.exemplos2.exemploExcepcions.Division;

public class Main {
    public static void main(String[] args) {

        Division2 obxDiv = new Division2();
        try {
            obxDiv.dividirNosaExcepcion(6,3);
        }catch (NosaExcepcion ex){
            System.out.println(ex.getMessage());
        }
    }
}
