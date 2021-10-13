package ExamenUF4;

public class Movil extends Dispositivo implements Recargable, Comparable<Dispositivo>{
    // Attributes
    private Bateria bateria;

    // Constructor
    public Movil(CPU cpu, RAM ram, HDD disco, Bateria bateria, int precioBase) {
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

    // Implemented Methods
    @Override
    public void recargarBateria() {
        bateria.setNivelBateria(100);
    }

    // toString
    @Override
    public String toString() {
        return "Movil" +
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
