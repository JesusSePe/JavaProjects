package HerenciaHomework;

public class Rentadora extends Electrodomestic{
    private float carrega;

    // Constructors
    public Rentadora() {
        super();
        setCarrega(5);
    }

    public Rentadora(float preu, float pes) {
        super(preu, pes);
        setCarrega(5);
    }

    public Rentadora(float preu, float pes, String color, String consum, float carrega) {
        super(preu, pes, color, consum);
        setCarrega(carrega);
    }

    // Setters & Getters


    public float getCarrega() {
        return carrega;
    }

    public void setCarrega(float carrega) {
        if (carrega > 0){
            this.carrega = carrega;
        } else {
            this.carrega = 5;
        }
    }

    @Override
    public float preuFinal() {
        if (getCarrega() > 30){
            return (getPreu()+50);
        } else {
            return getPreu();
        }
    }
}
