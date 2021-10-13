package ex2_interficie;

public class exempleMusical {

    public static void main(String[] args) {
        InstrumentCorda Guitarra = new InstrumentCorda();
        InstrumentVent Trompeta = new InstrumentVent();
        exempleMusical e = new exempleMusical();
        e.ManejoInstrument(Guitarra);
        e.ManejoInstrument(Trompeta);
    }

    public void ManejoInstrument(InstrumentMusical instrument){
        instrument.afinar();
        instrument.tocar();
        System.out.println(instrument.tipusInstrument());
    }
}
