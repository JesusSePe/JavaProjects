package ExamenUF4;

public class RAM {
    // Atributos
    private int gigas, precio;
    private String modelo;

    // Constructor
    public RAM(String modelo, int gigas, int precio) {
        this.gigas = gigas;
        this.precio = precio;
        this.modelo = modelo;
    }

    // Setters and Getters

    public int getGigas() {
        return gigas;
    }

    public void setGigas(int gigas) {
        this.gigas = gigas;
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
        return "RAM\n" +
                "Capacidad=" + getGigas() +
                "\nModelo=" + getModelo() +
                "\nPrecio=" + getPrecio()+"\n";
    }
}
