package ExamenUF4;

import java.util.ArrayList;

public abstract class Dispositivo {
    // Attributes
    private CPU cpu;
    private RAM ram;
    private int PrecioBase;
    private ArrayList<HDD> discos;

    // Constructors
    public Dispositivo(CPU cpu, RAM ram, HDD disco, int precio) {
        this.cpu = cpu;
        this.ram = ram;
        setPrecioBase(precio);
        addDisk(disco);
    }

    // Setters and Getters
    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public int getPrecioBase() {
        return PrecioBase;
    }

    public void setPrecioBase(int precio) {
        this.PrecioBase = precio;
    }

    public String getDiscos() {
        String Discos = "";
        for (HDD disco:discos){
            Discos += disco.toString();
        }
        return Discos;
    }

    public void setDiscos(ArrayList<HDD> discos) {
        this.discos = discos;
    }

    // Methods
    public void addDisk (HDD drive){
        discos.add(drive);
    }

    public int getDiskCapacity(){
        int total = 0;
        for (HDD drive:discos){
            total += drive.getGigas();
        }
        return total;
    }
}
