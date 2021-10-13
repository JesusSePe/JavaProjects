package ArrayList;

public class Triangle extends Figura{

    protected double base, altura;

    // Constructors

    public Triangle() {
        super();
    }

    public Triangle(String color) {
        super(color);
        this.calcularArea();
    }

    public Triangle(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
        this.calcularArea();
    }

    // Setters & getters


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // toString
    @Override
    public String toString() {
        return "Triangle{" +
                "color='" + color + '\'' +
                ", area=" + area +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }

    // Methods
    @Override
    public void calcularArea() {
        //setArea(base*altura/2);
        area=base*altura/2;
    }

    @Override
    public void trasladar(int num) {
        setX(getX()+num);
        setY(getY()+num);
    }

    @Override
    public void dibujar() {
        System.out.println("Estoy dibujando un triangulo");
    }
}
