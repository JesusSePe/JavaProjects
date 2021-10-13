package AbstractHomework;

public class Neteja extends Empleat{
    // Attributes. Neteja has no new Attributes.

    // Constructors
    public Neteja() {
    }

    public Neteja(String nom, String ciutatOrigen, String lloc) {
        super(nom, ciutatOrigen, lloc);
    }

    // Methods. Neteja has no new Methods, so we override the salariDiari one from the parent class
    @Override
    public float salariDiari() {
        return 35f;
    }
}
