package ExamenUF4;

import java.util.ArrayList;

public class Tablet extends Dispositivo implements Recargable, Comparable<Dispositivo> {
    // Attributes;
    private Bateria bateria;

    // Constructors
    public Tablet(CPU cpu, RAM ram, int precioBase, HDD disco, Bateria bateria) {
        super(cpu, ram, disco, precioBase);
        setBateria(bateria);
    }

    // Setters and Getters
    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    // Methods
    public int getPrecio(){
        int total = 0;
        total += this.getPrecioBase();
        total += this.bateria.getPrecio();
        return total;
    }

    // Implemented methods
    @Override
    public void recargarBateria() {
        bateria.setNivelBateria(100);
    }

    // toString

    @Override
    public String toString() {
        return "Tablet" +
                getCpu().toString() +
                getRam().toString() +
                "Discos\n"+
                getDiscos() +
                "Capacidad total almacenamiento ="+getDiskCapacity() + "\n"+
                getBateria().toString() +"\n" +
                getPrecio() + "\n";
    }

    @Override
    public int compareTo(Dispositivo o) {
        return this.getPrecioBase() - o.getPrecioBase();
    }
}
