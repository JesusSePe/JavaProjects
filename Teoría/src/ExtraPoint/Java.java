package ExtraPoint;

class Java extends Lenguaje{
    // Atributos
    String nombre;
    String print;

    // Constructores
    public Java() {
        super();
    }
    public Java(String nombre, String print) {
        super();
        this.nombre = nombre;
        this.print = print;
    }

    // Métodos
    void imprimir(Lenguaje L) {
        System.out.println("Java, mostrar por pantalla");
    }
    void identidad() {
        System.out.println("Soy Java.");
    }
}
