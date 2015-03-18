package listaSimple;

import java.util.ArrayList;
import java.util.List;

public class ListaAsignaturas {
    private final List<Asignatura> asignaturas;

    public ListaAsignaturas() {
        this.asignaturas = new ArrayList<>();
    }
    
    public void añadirAsignatura (Asignatura asignatura) {
        asignaturas.add(asignatura);
    }
    public void eliminarAsignatura (Asignatura asignatura) {
        asignaturas.remove(asignatura);
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }
   
 }
