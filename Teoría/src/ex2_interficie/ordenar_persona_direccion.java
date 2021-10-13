package ex2_interficie;

import java.util.Comparator;

public class ordenar_persona_direccion implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getDireccion().compareToIgnoreCase(o2.getDireccion());
    }
}

class ordenar_persona_nombre implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getNombre().compareToIgnoreCase(o2.getNombre());
    }
}