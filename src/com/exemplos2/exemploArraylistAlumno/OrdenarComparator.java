package com.exemplos2.exemploArraylistAlumno;

import java.util.Comparator;

public class OrdenarComparator implements Comparator<Alumno> {
    @Override
    public int compare(Alumno t, Alumno t1) {
        if (t.getNota()< t1.getNota()){
            return -1;
        }
        else if (t.getNota()> t1.getNota()){
            return 1;
        }
        else
        return 0;
    }
}
