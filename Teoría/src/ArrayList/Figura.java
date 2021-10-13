package ArrayList;

public abstract class Figura implements Trasladable, Dibujable {
    protected double x,y;

    protected String color;
    protected double area;

    // Constructors

    public Figura(){
        super();
    }

    public Figura(String color) {
        super();
        x=5;
        y=5;
        this.color = color;
    }

    // Setters & getters

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Methods
    public abstract void calcularArea();

    // toString

    @Override
    public String toString() {
        return "Figura{" +
                "color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}
