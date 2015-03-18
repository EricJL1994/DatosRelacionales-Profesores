package listaSimple;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GuardadorProfesor {
    
    public void execute(Profesor profesor) throws IOException{
        FileWriter guardador = new FileWriter("Profesores.txt",true);
        guardador.write("\r\n" + profesor.toString());
        guardador.close();
    }
    
    public Profesor crearProfesor() throws IOException{
        String name;
        int dni;
        String surname;
        long telefono;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un nombre: ");
        name = sc.nextLine();
        System.out.print("Introduce un dni: ");
        dni = sc.nextInt();
        System.out.print("Introduce un apellido: ");
        surname = sc.next();
        System.out.print("Introduce un telefono: ");
        telefono = sc.nextLong();
        
        Profesor profesor = new Profesor(name, dni, surname, telefono);
        execute(profesor);
        return profesor;
    }
}