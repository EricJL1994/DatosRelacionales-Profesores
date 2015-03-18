package listaSimple;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GuardadorAsignatura {

    public void execute(Asignatura asignatura) throws IOException {
        FileWriter guardador = new FileWriter("Asignaturas.txt");
        guardador.write("\r\n" + asignatura.toString());
        guardador.close();
    }

    public Asignatura crearAsignatura() throws IOException {

        String temario;
        int aula;
        int duracion;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un temario: ");
        temario = sc.nextLine();
        System.out.print("Introduce un aula: ");
        aula = sc.nextInt();
        System.out.print("Introduce una duracion: ");
        duracion = sc.nextInt();

        Asignatura asignatura = new Asignatura(temario, duracion, aula);
        String alumno;
        while ((alumno = sc.next()) != "") {
            System.out.println("Introduce un alumno de la asignatura: ");
            asignatura.insertarAlumnos(alumno);
        }
        execute(asignatura);
        return asignatura;
    }
}
