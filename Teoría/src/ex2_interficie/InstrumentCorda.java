package ex2_interficie;

public class InstrumentCorda implements InstrumentMusical{
    @Override
    public void tocar() {
        System.out.println("Estoy tocando un instrumento de cuerda");
    }

    @Override
    public void afinar() {
        System.out.println("Estoy afinando un instrumento de cuerda");
    }

    @Override
    public String tipusInstrument() {
        return ("Soy un instrumento de cuerda");
    }
}
