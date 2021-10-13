package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class FrmPersona {
    public static void main(String[] args) {
        ArrayList<Persona> a = new ArrayList<Persona>();
        Scanner lector = new Scanner(System.in);

        int optn;
        do {
            System.out.println("1.-Afegir Persona\n2.-Mostrar dades\n3.-Eliminar\n4.-Sortir");
            optn = lector.nextInt();
            int dni;
            switch (optn) {
                /*
                 * Introduir les dades per a una persona de la llista
                 * 2. Mostrar les dades de les persones emmagatzemades
                 * 3. Elim inar una persona de la llista. S’haurà de preguntar a l’usuari
                 *  el DNI de la persona a eliminar.
                 * 4. Sortir.
                 * */
                case 1:
                    lector.nextLine();
                    System.out.println("Nom: ");
                    String nom = lector.nextLine();
                    System.out.println("Edat: ");
                    int edat = lector.nextInt();
                    System.out.println("Altura: ");
                    double altura = lector.nextDouble();
                    lector.nextLine();
                    System.out.println("Sexe: ");
                    char sexe = lector.next().charAt(0);
                    System.out.println("Casat: ");
                    boolean casat = lector.nextBoolean();
                    System.out.println("DNI: ");
                    dni = lector.nextInt();
                    Persona p = new Persona(nom, edat, altura, sexe, casat, dni);
                    a.add(p);
                    break;
                case 2:
                    for (Persona f : a) {
                        System.out.println(f.toString());
                    }
                    break;
                case 3:
                    System.out.println("Dni de la persona a eliminar: ");
                    dni = lector.nextInt();
                    for (Persona per:a){
                        if (per.getDNI() == dni) {
                            a.remove(per);
                        }
                    }
                    break;
                case 4:
                    optn = 5;
                    System.out.println("Gracies per utilitzar aquest servei.");
                    break;
            }
        } while (optn > 0 && optn < 5);
    }
}
