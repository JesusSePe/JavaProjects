package ExamenUF4;

public class PCMesa extends Dispositivo implements Comparable<Dispositivo>{
    // Attributes
    private Bateria bateria;

    // Constructor
    public PCMesa(CPU cpu, RAM ram, HDD disco, int precioBase) {
        super(cpu, ram, disco, precioBase);
    }

    // Methods
    public int getPrecio(){
        int total = 0;
        total += this.getPrecioBase();
        total += this.bateria.getPrecio();
        return total;
    }

    // toString
    @Override
    public String toString() {
        return "PCMesa" +
                getCpu().toString() +
                getRam().toString() +
                "Discos\n"+
                getDiscos() +
                "Capacidad total almacenamiento ="+getDiskCapacity() + "\n"+
                getPrecio() + "\n";
    }

    @Override
    public int compareTo(Dispositivo o) {
        return this.getPrecioBase() - o.getPrecioBase();
    }
}
