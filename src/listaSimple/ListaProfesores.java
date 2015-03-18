package listaSimple;

import java.util.ArrayList;
import java.util.List;

public class ListaProfesores {
    private final List<Profesor> listaProfesor;

    public ListaProfesores() {
        this.listaProfesor = new ArrayList<>();
    }
    public void añadirProfesor (Profesor profesor) {
        listaProfesor.add(profesor);
    }
    public void eliminarProfesor (Profesor profesor) {
        listaProfesor.remove(profesor);
    }

    public List<Profesor> getListaProfesor() {
        return listaProfesor;
    }
    
    
    
}
