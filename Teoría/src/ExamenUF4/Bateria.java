package ExamenUF4;

public class Bateria {
    // Attributes
    private int capacidad, nivelBateria, precio;
    private String modelo;

    // Constructor
    public Bateria(String modelo, int capacidad, int nivelBateria, int precio) {
        this.capacidad = capacidad;
        this.nivelBateria = nivelBateria;
        this.precio = precio;
        this.modelo = modelo;
    }

    // Setters and Getters

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // toString

    @Override
    public String toString() {
        return "Bateria\n" +
                "Capacidad=" + getCapacidad() +
                "\nNivelBateria=" + getNivelBateria() +
                "\nModelo=" + getPrecio() +
                "\nPrecio=" + getPrecio() + "\n";
    }
}
