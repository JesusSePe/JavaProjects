package Abstracto;

public abstract class figura {
    private int x, y; // Posición donde se ha dibujado la figura

    public figura() {

    }

    public figura(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public abstract float calcularArea();
    public abstract float calcularPerimetro();

    @Override
    public String toString() {
        return "figura{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
