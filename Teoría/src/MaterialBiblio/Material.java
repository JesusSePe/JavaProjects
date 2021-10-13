package MaterialBiblio;

public class Material {
    private int codi;
    private String titol;
    private String autor;

    public Material(){

    }
    public Material(String titol) {
        this.titol = titol;
    }
    public Material(String titol, String autor) {
        this.titol = titol;
        this.autor = autor;
    }
    public Material(String titol, String autor, int codi) {
        this.titol = titol;
        this.autor = autor;
        this.codi = codi;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    @Override
    public String toString(){
        String cadena = "CODI: "+this.codi+"\nTITOL: "+this.titol+"\nAUTOR: "+this.autor+"\nCODI: "+this.codi;
        return super.toString()+cadena;
    }
}
