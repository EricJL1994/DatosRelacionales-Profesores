package listaSimple;

public class Profesor {
    private  String name;
    private  int dni;
    private  String surname;
    private  long telefono;

    public Profesor(String name, int dni, String surname, long telefono) {
        this.name = name;
        this.dni = dni;
        this.surname = surname;
        this.telefono = telefono;
    }

    public String getName() {
        return name;
    }

    public int getDni() {
        return dni;
    }

    public String getSurname() {
        return surname;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    //Para pasar el objeto a una String
    @Override
    public String toString() {
        return name + "," + dni + "," + surname + "," + telefono;
    }

    
}

