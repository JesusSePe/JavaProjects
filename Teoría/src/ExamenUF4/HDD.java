package ExamenUF4;

public class HDD {
    // Attributes
    private int Gigas, precio;
    private String tipo;

    // Constructor

    public HDD(String tipo, int gigas, int precio) {
        Gigas = gigas;
        this.precio = precio;
        this.tipo = tipo;
    }

    // Setters and Getters

    public int getGigas() {
        return Gigas;
    }

    public void setGigas(int gigas) {
        Gigas = gigas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // toString

    @Override
    public String toString() {
        return "HDD" +
                "\nCapacidad=" + getGigas() +
                "\nTipo=" + getTipo() +
                "\nPrecio=" + getPrecio() + "\n";
    }
}
