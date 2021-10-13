public class Persona {
    //ATRIBUTOS: Caracteristicas de la persona (variables)
    private String nombre;
    private int edad;
    private String ciudad;


    //METODOS: Lo que se le permite hacer a una persona, gestionado por funciones.

    // Constructor/es: Tiene el nombre de la clase
    Persona(){
        this.ciudad = "Cornella";
    }
    Persona(String nombre){

        this.nombre = nombre;
    }
    Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = "Barcelona";
    }

    Persona(String nombre, int edad, String ciudad){
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    // Setters/getters

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getCiudad(){
        return this.ciudad;
    }
    public int getEdad(){
        return this.edad;
    }

    // Informacion del objeto. Con hacer system.out.println(objeto) o objeto.toString sirve.
    @Override
    public String toString(){
        String cadena = "Nombre:"+ this.nombre+"\nEdad: "+this.edad;
        return cadena;
    }

    void cantar(){
        System.out.println("La, la, la");
    }
}
