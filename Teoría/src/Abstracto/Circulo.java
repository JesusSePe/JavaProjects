package Abstracto;

public class Circulo extends figura{
    private int radi;

    public Circulo() {
    }

    public Circulo(int radi, int x, int y) {
        super(x, y);
        this.radi = radi;
    }

    @Override
    public float calcularArea() {
        return (float) (Math.PI * Math.pow((double) radi, 2.0));
    }

    @Override
    public float calcularPerimetro() {
        return 0;
    }
}
