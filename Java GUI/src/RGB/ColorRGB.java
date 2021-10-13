package RGB;

public class ColorRGB {
    private int r,g,b;

    // Constructor general
    public ColorRGB(int r, int g, int b) {
        int status = asignarColor(r, g, b);
        if (status == 0) {
            System.out.println("Todos los colores son correctos");
        } else if (status == 1) {
            System.out.println("Valor R = "+r+" fuera de rango. Se ha sustituido por 0");
        }else if (status == 2) {
            System.out.println("Valor G = "+g+" fuera de rango. Se ha sustituido por 0");
        }else if (status == 3) {
            System.out.println("Valor R = "+r+" fuera de rango. Valor G = "+g+" fuera de rango. Se han sustituido por 0");
        }else if (status == 4) {
            System.out.println("Valor B = "+b+" fuera de rango. Se ha sustituido por 0");
        }else if (status == 5) {
            System.out.println("Valor R = "+r+" fuera de rango. Valor B = "+b+" fuera de rango. Se han sustituido por 0");
        }else if (status == 6) {
            System.out.println("Valor G = "+g+" fuera de rango. Valor B = "+b+"fuera de rango. Se han sustituido por 0");
        }else if (status == 7) {
            System.out.println("Valor R = "+r+" fuera de rango. Valor G = "+g+" fuera de rango. Valor B = "+b+"fuera de rango. Se han sustituido por 0");
        }
    }

    // Asignador de colores
    public int asignarColor(int r, int g, int b) {
        int fail = 0;
        try {
            this.r = asignarColorR(r);
        } catch (ColorRGBException e) {
            this.r = 0;
            fail += 1;
        }
        try {
            this.g = asignarColorG(g);
        } catch (ColorRGBException e) {
            this.g = 0;
            fail += 2;
        }
        try {
            this.b = asignarColorB(b);
        } catch (ColorRGBException e) {
            this.b = 0;
            fail += 4;
        }
        return fail;
    }

    // Setters de color
    public int asignarColorR(int r) throws ColorRGBException {
        if (0 <= r && r <= 255) {
            return r;
        } else {
            throw new ColorRGBException();
        }
    }
    public int asignarColorG(int g) throws ColorRGBException {
        if (0 <= g && g <= 255) {
            return g;
        } else {
            throw new ColorRGBException();
        }
    }
    public int asignarColorB(int b) throws ColorRGBException {
        if (0 <= b && b <= 255) {
            return b;
        } else {
            throw new ColorRGBException();
        }
    }

    // Getter de color
    public int[] obtenerColor() {
        r = obtenerColorR();
        g = obtenerColorG();
        b = obtenerColorB();
        int[] res = {r,g,b};
        return (res);
    }

    // Getters de color
    public int obtenerColorR(){
        return this.r;
    }
    public int obtenerColorG(){
        return this.g;
    }
    public int obtenerColorB(){
        return this.b;
    }
}

// Excepción de color genérica.
class ColorRGBException extends Exception {
    public ColorRGBException() {}
    public ColorRGBException(String texto) {
        super(texto);
        System.out.println("Valor incorrecto");
    }
}