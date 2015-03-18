package listaSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CargadorAsignatura {

    private ListaAsignaturas lista;

    public CargadorAsignatura() {
        this.lista = new ListaAsignaturas();
    }

    public ListaAsignaturas execute() throws FileNotFoundException, IOException {

        File file = new File("Asignaturas.txt");
        BufferedReader lector = new BufferedReader(new FileReader(file));
        String linea = "";
        while ((linea = lector.readLine()) != null) {
            String[] currencyFields = linea.split(",");
            String temario = currencyFields[1];
            int aula = Integer.parseInt(currencyFields[2]);
            int duracion = Integer.parseInt(currencyFields[3]);

            Asignatura asignatura = new Asignatura(temario, aula, duracion);
            if (currencyFields.length > 3) {
                for (int i = 4; i < currencyFields.length; i++) {
                    asignatura.insertarAlumnos(currencyFields[i]);
                }

            }
            lista.añadirAsignatura(asignatura);
        }
        return lista;
    }
}
