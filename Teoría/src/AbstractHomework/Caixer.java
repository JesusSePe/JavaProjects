package AbstractHomework;

public class Caixer extends Empleat{
    // Attributes
    private int HoresTreballades;

    // Constructors
    public Caixer(int horesTreballades) {
        HoresTreballades = horesTreballades;
    }

    public Caixer(String nom, String ciutatOrigen, String lloc, int horesTreballades) {
        super(nom, ciutatOrigen, lloc);
        HoresTreballades = horesTreballades;
    }

    // Setters&Getters
    public int getHoresTreballades() {
        return HoresTreballades;
    }

    public void setHoresTreballades(int horesTreballades) {
        HoresTreballades = horesTreballades;
    }


    // Methods
    public int horesTreballades(){
        return this.HoresTreballades;
    }

    @Override
    public float salariDiari() {
        return 15f;
    }
}
