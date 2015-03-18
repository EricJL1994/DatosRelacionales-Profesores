package listaSimple;

import java.util.ArrayList;
import java.util.List;

public class Asignatura {

    private static int ultimoId = 0;
    private final int id;
    private String temario;
    private int aula;
    private List<String> alumnos;
    private int duracion;

    public Asignatura(String temario, int aula, int duracion) {
        this.id = ponerId();
        this.temario = temario;
        this.aula = aula;
        this.alumnos = new ArrayList<>();
        this.duracion = duracion;
    }

    public static int getUltimoId() {
        return ultimoId;
    }

    public int getId() {
        return id;
    }

    public String getTemario() {
        return temario;
    }

    public int getAula() {
        return aula;
    }

    public List<String> getAlumnos() {
        return alumnos;
    }

    public int getDuracion() {
        return duracion;
    }


    public void setTemario(String temario) {
        this.temario = temario;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public void setAlumnos(List<String> alumnos) {
        this.alumnos = alumnos;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public void insertarAlumnos (String alumno) {
        alumnos.add(alumno);
    }
    
    public void eliminarAlumnos (String alumno) {
        alumnos.remove(alumno);
    }

    @Override
    public String toString() {
        String result = id + "," + temario + "," + aula + "," + duracion;
        for (String alumno : alumnos) {
            result += "," + alumno;
        }
        return result;
    }
    
    //id es el mismo para todas las asignaturas, en el constructor llamaos a ponerId
    //y cada vez asigna uno mas
    private int ponerId() {
        return ultimoId++;
    }
}
