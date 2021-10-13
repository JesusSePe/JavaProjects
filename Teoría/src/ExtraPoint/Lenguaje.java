package ExtraPoint;

class Lenguaje {
    // Atributos
    String nombre;
    String print;

    // Constructores
    public Lenguaje(){
        super();
    }
    public Lenguaje(String nombre, String print) {
        super();
        this.nombre = nombre;
        this.print = print;
    }

    // Metodos
    void imprimir(Lenguaje L) {
        System.out.println("Lenguaje de programación genérico, mostrar por pantalla");
    }
    void imprimir(Java J) {
        System.out.println("Lenguaje de programación genérico, System.out.println();");
    }
    void identidad() {
        System.out.println("Soy un lenguaje cualquiera.");
    }
}
