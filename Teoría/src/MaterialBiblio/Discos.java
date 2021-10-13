package MaterialBiblio;

public class Discos extends Material{
    private String nomDiscografica;

    // Constructores
    public Discos(String nomDiscografica){
        this.nomDiscografica=nomDiscografica;
    }

    public Discos(String nomDiscografica, String autor, String titol, int codi) {
        super(autor, titol, codi);
        this.nomDiscografica=nomDiscografica;
    }

    // Setters
    public void setnomDiscografica(String nomDiscografica) {
        this.nomDiscografica = nomDiscografica;
    }

    // Getters

    public String getnomDiscografica(){
        return this.nomDiscografica;
    }

    // Informacion del objeto
    @Override
    public String toString(){
        String cadena = "\nnomDiscografica: "+this.nomDiscografica;
        return super.toString()+cadena;
    }
}
