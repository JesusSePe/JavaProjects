package ArrayList;


import java.util.Scanner;

public class FrmProducte {
    public static void main(String[] args) {
        arrayProducte array = new arrayProducte();
        Scanner s = new Scanner(System.in);
        int optn;

        System.out.println("1. Afegir productes evitant repetits\n2. Augmentar el preu dels productes tipus 'oficina' en un 10% \n3.Eliminar els productes que tinguin estocs zero\n4. Mostrar tots els productes que hi ha a l'ArrayList.");

        do {
            optn = s.nextInt();
            switch (optn){
                case 1:
                    System.out.println("Introduce el código");
                    array.agregar(s.nextInt());
                    break;
                case 2:
                    for (Producte prod:array.a){
                        if(prod.getTipus().equalsIgnoreCase("Oficina")) {
                            prod.setPreu(prod.getPreu()*1.1);
                        }
                    }
                    break;
                case 3:
                    array.eliminarStockCero();
                    break;
                case 4:
                    break;
            }
        } while (optn > 0 && optn < 5);
    }
}
