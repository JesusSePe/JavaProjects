package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;


public class arrayProducte {
    ArrayList <Producte> a = new ArrayList<Producte>();
    Scanner s = new Scanner(System.in);
    //Methods
    public void agregar(){
        Producte p = new Producte();
        System.out.println("Codigo: ");
        p.setCodi(s.nextInt());
        s.nextLine();
        System.out.println("Nombre: ");
        p.setNom(s.nextLine());
        System.out.println("Tipo: ");
        p.setTipus(s.nextLine());
        System.out.println("Precio: ");
        p.setPreu(s.nextDouble());
        s.nextLine();
        a.add(p);
    }
    public void agregar(int codi){
        Producte p = new Producte();
        p.setCodi(codi);
        if (buscarCod(codi)) {
            System.out.println("Nombre: ");
            p.setNom(s.nextLine());
            System.out.println("Tipo: ");
            p.setTipus(s.nextLine());
            System.out.println("Precio: ");
            p.setPreu(s.nextDouble());
            s.nextLine();
            a.add(p);
        }
    }
    public void eliminar(){
        System.out.println("Codigo a eliminar: ");
        int codi = s.nextInt();
        for (Producte prod:a) {
            if (prod.getCodi() == codi) {
                a.remove(prod);
                System.out.println("Objeto eliminado");
                break;
            }
        }

    }

    public Producte obtener(){
        System.out.println("Nombre a obtener");
        String nom = s.nextLine();
        for (Producte prod:a) {
            if (prod.getNom().equalsIgnoreCase(nom)){
                return prod;
            }
        }
        return null;
    }

    public boolean buscar(){
        System.out.println("Nombre a buscar");
        String nom = s.nextLine();
        for (Producte prod:a) {
            if (prod.getNom().compareToIgnoreCase(nom)==0){
                return true;
            }
        }
        return false;
    }

    public boolean buscarCod(int cod){
        for (Producte prod:a) {
            if (prod.getCodi()==cod){
                return true;
            }
        }
        return false;
    }

    public int grandaria() {
        return a.size();
    }

    public void eliminarStockCero() {
        for (Producte prod:a){
            if (prod.getStock() == 0) {
                a.remove(prod);
            }
        }
    }

    public void mostrarArrayList() {
        for (Producte prod:a) {
            System.out.println(prod.toString());
        }
    }

}
