package ArrayList;

public class Producte {
    // Variables
    protected int codi, stock;
    protected String nom, tipus;
    protected double preu;

    // Constructors
    public Producte() {
    }

    public Producte(int codi, int stock, String nom, String tipus, double preu) {
        this.codi = codi;
        this.stock = stock;
        this.nom = nom;
        this.tipus = tipus;
        this.preu = preu;
    }

    // Setters & Getters
    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    @Override
    public String toString() {
        return "Producte{" +
                "codi=" + codi +
                ", stock=" + stock +
                ", nom='" + nom + '\'' +
                ", tipus='" + tipus + '\'' +
                ", preu=" + preu +
                '}';
    }
}
