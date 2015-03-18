package listaSimple;

import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws IOException {
        ListaAsignaturas asignaturas = new CargadorAsignatura().execute();
        ListaProfesores profesores = new CargadorProfesor().execute();
        etiqueta:
        while (true) {
            System.out.println("\n************************");
            System.out.println("1.Mostrar profesores");
            System.out.println("2.Mostrar asignaturas");
            System.out.println("3.Guardar un profesor");
            System.out.println("4.Guardar una asignatura");
            System.out.println("5.Salir");
            System.out.println("************************");
            System.out.print("Introduzca su valor: ");
            Scanner sc = new Scanner(System.in);
            int caso = sc.nextInt();
            System.out.println("");
            switch (caso) {
                case 1:
                    for (Profesor prof : profesores.getListaProfesor()) {
                        System.out.println(prof);
                    }
                    break;
                case 2:
                    for (Asignatura asignatura : asignaturas.getAsignaturas()) {
                        System.out.println(asignatura);
                    }
                    break;
                case 3:
                    Profesor profesor = new GuardadorProfesor().crearProfesor();
                    profesores.añadirProfesor(profesor);
                    System.out.println(profesor);
                    System.out.println("Profesor guardado");
                    break;
                case 4:
                    Asignatura asignatura = new GuardadorAsignatura().crearAsignatura();
                    asignaturas.añadirAsignatura(asignatura);
                    System.out.println(asignatura);
                    System.out.println("Asignatura guardada");
                    break;
                case 5:
                    break etiqueta;
                default:
                    System.out.println("Número no válido");
            }
        }
    }
}
