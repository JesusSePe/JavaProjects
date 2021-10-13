package RGB;

public class Pixel{
    private int x, y;
    ColorRGB color;

    // Constructor
    public Pixel(int r, int g, int b, int x, int y) {
        this.color = new ColorRGB(r,g,b);
        asignarPosicion(x, y);
    }

    // Setter general
    public void asignarPosicion(int x, int y) {
        asignarPosicionX(this.x);
        asignarPosicionY(this.y);
    }

    // Setters individuales
    public void asignarPosicionX(int x) {
        this.x = x;
    }

    public void asignarPosicionY(int y) {
        this.y = y;
    }

    // Getter general
    public int[] obtenerPosicion() {
        x = obtenerPosicionX();
        y = obtenerPosicionY();
        int[] res = {x, y};
        return (res);
    }

    // Getters de posicion
    public int obtenerPosicionX(){
        return this.x;
    }
    public int obtenerPosicionY() {
        return this.y;
    }


}
