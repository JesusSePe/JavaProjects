package HerenciaHomework;

public class Televisio extends Electrodomestic{
    private float resolucio;
    private boolean TDT;

    // Constructors

    public Televisio() {
        super();
        setResolucio(20);
        setTDT(false);
    }

    public Televisio(float preu, float pes) {
        super(preu, pes);
        setResolucio(20);
        setTDT(false);
    }

    public Televisio(float preu, float pes, String color, String consum, float resolucio, boolean TDT) {
        super(preu, pes, color, consum);
        setResolucio(resolucio);
        setTDT(TDT);
    }

    // Setters & Getters

    public float getResolucio() {
        return resolucio;
    }

    public void setResolucio(float resolucio) {
        if (resolucio > 0) {
            this.resolucio = resolucio;
        } else {
            this.resolucio = 20;
        }

    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    @Override
    public float preuFinal() {
        float total = getPreu();
        if (getResolucio() > 40){
            total = (total * 1.3f);
        }
        if (isTDT()) {
            total += 50;
        }
        return total;
    }
}
