package Abstracto;

public class Rectangulo extends figura{
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(int x, int y, int base, int altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return base*altura;
    }

    @Override
    public float calcularPerimetro() {
        return 0;
    }
}
