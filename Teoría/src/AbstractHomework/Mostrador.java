package AbstractHomework;

public class Mostrador extends Empleat{
    // Attributes
    private int Vendes;

    // Constructors
    public Mostrador(int vendes) {
        Vendes = vendes;
    }

    public Mostrador(String nom, String ciutatOrigen, String lloc, int vendes) {
        super(nom, ciutatOrigen, lloc);
        Vendes = vendes;
    }

    // Setters&Getters

    public int getVendes() {
        return Vendes;
    }

    public void setVendes(int vendes) {
        Vendes = vendes;
    }

    // Methods
    private int vendes(){
        return this.Vendes;
    }

    @Override
    public float salariDiari() {
        return (float) (50 + getVendes()*0.15);
    }
}
