package EjercicioHerencia;

public class inmuebles {
    private String direccion;
    private int anios, metros;
    private float precio;
    private boolean estado;

    // Constructor vacío
    public inmuebles(){}

    // Constructor completo
    public inmuebles(String direccion, int anios, int metros, float precio, boolean estado) {
        this.direccion = direccion;
        setAnios(anios);
        this.metros = metros;
        this.precio = precio;
        this.estado = estado;
    }

    // Setters & Getters

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAnios() {
        return anios;
    }

    // Años debe ser siempre mayor o igual a 0.
    public void setAnios(int anios) {
        if (anios < 0) {
            this.anios = 0;
        } else {
            this.anios = anios;
        }
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "inmuebles{" +
                "direccion='" + direccion + '\'' +
                ", anios=" + anios +
                ", metros=" + metros +
                ", precio=" + precio +
                ", estado=" + estado +
                '}';
    }

    public void calcularPrecio(){
        if (this.anios < 15) {
            this.precio = this.precio*0.99f;
        } else {
            this.precio = this.precio*0.98f;
        }
    }
}
