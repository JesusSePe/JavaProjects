package ExamenUF4;

public class CPU {
    // Atributos
    private int megaherzios, numeroNucleos, precio;
    private String modelo;

    // Constructores

    public CPU(String modelo, int megaherzios, int numeroNucleos, int precio) {
        this.megaherzios = megaherzios;
        this.numeroNucleos = numeroNucleos;
        this.precio = precio;
        this.modelo = modelo;
    }

    // Setters and Getters

    public int getMegaherzios() {
        return megaherzios;
    }

    public void setMegaherzios(int megaherzios) {
        this.megaherzios = megaherzios;
    }

    public int getNumeroNucleos() {
        return numeroNucleos;
    }

    public void setNumeroNucleos(int numeroNucleos) {
        this.numeroNucleos = numeroNucleos;
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
        return "CPU \n" +
                "Velocidad=" + getMegaherzios() +
                "\nnumeroNucleos=" + getNumeroNucleos() +
                "\nmodelo=" + getModelo() +
                "\nprecio=" + getPrecio()+"\n";
    }
}
