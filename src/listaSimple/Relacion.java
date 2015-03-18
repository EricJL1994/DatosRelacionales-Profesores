package listaSimple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Relacion {
    Map<Profesor, ArrayList<Asignatura>> relacion;

    public Relacion() {
        this.relacion = new HashMap<>();
    }
    
    public void añadirProfesor (Profesor profesor) {
        relacion.put(profesor, new ArrayList<>());
    }
    
    public void eliminarProfesor (Profesor profesor) {
        relacion.remove(profesor);
    }
    
    public void añadirAsignaturas (Profesor profesor, Asignatura asignatura) {
        (relacion.get(profesor)).add(asignatura);
    }
    
    public void eliminarAsignaturas (Profesor profesor, Asignatura asignatura) {
        (relacion.get(profesor)).remove(asignatura);
    }
    
    
    
}
