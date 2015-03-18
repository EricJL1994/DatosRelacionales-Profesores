package listaSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CargadorProfesor {
    private ListaProfesores lista;

    public CargadorProfesor() {
        this.lista = new ListaProfesores();
    }
    
    public ListaProfesores execute() throws FileNotFoundException, IOException{
        
        File file = new File("Profesores.txt");
        BufferedReader lector = new BufferedReader(new FileReader(file));
        String linea;
        while ((linea = lector.readLine())!=null) {
            String[] currencyFields = linea.split(",");
            String nombre = currencyFields[0];
            int dni = Integer.parseInt(currencyFields[1]);
            String apellido = currencyFields[2];
            long tel = Long.parseLong(currencyFields[3]);
            
            lista.añadirProfesor(new Profesor(nombre,dni,apellido,tel));
        }
        
        return lista;
    }
}
