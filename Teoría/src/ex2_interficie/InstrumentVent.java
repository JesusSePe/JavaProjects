package ex2_interficie;

public class InstrumentVent implements InstrumentMusical{

    @Override
    public void tocar() {
        System.out.println("Estoy tocando un instrumento de viento");
    }

    @Override
    public void afinar() {
        System.out.println("Estoy afinando un instrumento de viento");
    }

    @Override
    public String tipusInstrument() {
        return ("Soy un instrumento de viento");
    }
}
