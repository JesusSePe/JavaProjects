package ArrayList;

public class Cercle extends Figura{

    protected double radi;

    // Constructors

    public Cercle() {
        super();
    }

    public Cercle(double radi) {
        this.radi = radi;
        this.calcularArea();
    }

    public Cercle(String color, double radi) {
        super(color);
        this.radi = radi;
        this.calcularArea();

    }

    // Setters & getters


    public double getRadi() {
        return radi;
    }

    public void setRadi(double radi) {
        this.radi = radi;
    }

    // toString


    @Override
    public String toString() {
        return "Cercle{" +
                "radi=" + radi +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }

    // Methods
    @Override
    public void calcularArea() {
        area=Math.PI*radi*radi;
    }

    @Override
    public void trasladar(int num) {
        setX(getX()+num);
        setY(getY()+num);
    }

    @Override
    public void dibujar() {
        System.out.println("Estoy dibujando un circulo");
    }
}
