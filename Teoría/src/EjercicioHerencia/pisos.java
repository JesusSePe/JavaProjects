package EjercicioHerencia;

public class pisos extends inmuebles{
    private int numeroPiso;

    public pisos(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    public pisos(String direccion, int anios, int metros, float precio, boolean estado) {
        super(direccion, anios, metros, precio, estado);
    }

    public pisos(String direccion, int anios, int metros, float precio, boolean estado, int numeroPiso) {
        super(direccion, anios, metros, precio, estado);
        this.numeroPiso = numeroPiso;
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    @Override
    public String toString() {
        return super.toString()+ "pisos [numeroPiso= "+this.numeroPiso+"]";
    }

    @Override
    public void calcularPrecio(){
        super.calcularPrecio();
        if (numeroPiso >= 3){
            setPrecio(getPrecio()*1.03f);
        }
    }

}
