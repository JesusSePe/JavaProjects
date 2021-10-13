package MaterialBiblio;

public class Llibre extends Material{
    private int paginas;

    // Constructores
    public Llibre(String autor, String titol, int codi){
        super(autor, titol, codi);
    }

    public Llibre(int paginas) {
        this.paginas = paginas;
    }

    public Llibre(String titol, String autor, int codi, int paginas) {
        super(titol, autor, codi);
        this.paginas = paginas;
    }

    // Setters
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    // Getters
    public int getPaginas(){
        return this.paginas;
    }

    // Informacion del objeto
    @Override
    public String toString(){
        String cadena = "\nPAGINAS: "+this.paginas;
        return super.toString()+cadena;
    }

}
