package ex2_interficie;

public class Persona  implements Comparable<Persona>{
    private String nombre, direccion;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String direccion, int edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
    }

    // Setters & Getters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // toString()
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public int compareTo(Persona o) {
        if (edad < o.getEdad()) {
            return -1;
        } else if (edad > o.getEdad()) {
            return 1;
        }
        return 0;
    }
}
