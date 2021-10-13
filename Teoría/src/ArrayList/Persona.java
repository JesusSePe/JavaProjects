package ArrayList;

public class Persona {
    private String nom;
    private int edat;
    private double altura;
    private char sexe;
    private boolean casat;
    private int DNI;

    // Constructors

    public Persona() {
    }

    public Persona(String nom, int edat, double altura, char sexe, int DNI) {
        this.nom = nom;
        this.edat = edat;
        this.altura = altura;
        this.sexe = sexe;
        this.casat = false;
        this.DNI = DNI;
    }

    public Persona(String nom, int edat, double altura, char sexe, boolean casat, int DNI) {
        this.nom = nom;
        this.edat = edat;
        this.altura = altura;
        this.sexe = sexe;
        this.casat = true;
        this.DNI = DNI;
    }

    // Setters & getters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public boolean isCasat() {
        return casat;
    }

    public void setCasat(boolean casat) {
        this.casat = casat;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
// toString


    @Override
    public String toString() {
        return "Persona{" +
                "nom='" + nom + '\'' +
                ", edat=" + edat +
                ", altura=" + altura +
                ", sexe=" + sexe +
                ", casat=" + casat +
                ", DNI=" + DNI +
                '}';
    }
}
