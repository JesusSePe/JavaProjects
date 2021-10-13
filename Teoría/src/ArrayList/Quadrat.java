package ArrayList;

public class Quadrat extends Figura{
    protected double lado;

    // Constructors

    public Quadrat() {
    }

    public Quadrat(double lado) {
        this.lado = lado;
        this.calcularArea();
    }

    public Quadrat(String color, double lado) {
        super(color);
        this.lado = lado;
        this.calcularArea();
    }

    // Setters & getters

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    // toString


    @Override
    public String toString() {
        return "Quadrat{" +
                "color='" + color + '\'' +
                ", area=" + area +
                ", lado=" + lado +
                '}';
    }

    // Methods
    @Override
    public void calcularArea() {
        area= lado * lado;
    }

    @Override
    public void trasladar(int num) {
        setX(getX()+num);
        setY(getY()+num);
    }

    @Override
    public void dibujar() {
        System.out.println("Estoy dibujando un cuadrado");
    }
}
