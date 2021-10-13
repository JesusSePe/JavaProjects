package AbstractHomework;

public abstract class Empleat {
    // Attributes
    private String Nom, CiutatOrigen, Lloc;

    // Constructors
    public Empleat() {
    }

    public Empleat(String nom, String ciutatOrigen, String lloc) {
        Nom = nom;
        CiutatOrigen = ciutatOrigen;
        Lloc = lloc;
    }

    public String getNom(){
        return this.Nom;
    }

    public String getLloc(){
        return this.Lloc;
    }
    public String getCiutatOrigen(){
        return this.CiutatOrigen;
    }

    public abstract float salariDiari();

}
