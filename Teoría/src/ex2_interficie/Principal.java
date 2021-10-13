package ex2_interficie;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {

    public static void main (String[] args) {

        ArrayList <Persona> a = new ArrayList<Persona>();

        a.add(new Persona("Waluigi", "Wall Street 13", 21 ));
        a.add(new Persona("Wah", "Wall Street 10", 20 ));
        a.add(new Persona("Luigi", "Wall Street 15", 22 ));

        Collections.sort(a, new ordenar_persona_direccion());
        System.out.println(a);
        Collections.sort(a, new ordenar_persona_nombre());
        System.out.println(a);
    }
}
