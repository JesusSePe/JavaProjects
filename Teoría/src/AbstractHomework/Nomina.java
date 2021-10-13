package AbstractHomework;

import java.util.Scanner;

public class Nomina {
    // Attributes
    Empleat[] empleats = new Empleat[5];
    int EmpCount = 0;

    // Constructor

    public Nomina(Empleat[] empleats) {
        this.empleats = empleats;
    }

    // Methods

    public void inserixEmpleat(){
        Scanner sc=new Scanner(System.in);
        int option;
        System.out.println("Quin tipus d'empleat vols afegir?\n1.- Caixer\n2.- Neteja\n3.- Mostrador");
        option = sc.nextInt();
        if ((option >= 1) && (option <= 3)){
            System.out.println("Nom del empleat: ");
            String nom = sc.nextLine();

            System.out.println("Ciutat d'origen del empleat: ");
            String origen = sc.nextLine();

            System.out.println("Lloc del empleat: ");
            String lloc = sc.nextLine();

            switch (option){
                case 1:
                    System.out.println("Hores Treballades del empleat: ");
                    int hores = sc.nextInt();
                    empleats[EmpCount] = new Caixer(nom, origen, lloc, hores);
                    EmpCount += 1;
                case 2:
                    empleats[EmpCount] = new Neteja(nom, origen, lloc);
                    EmpCount += 1;
                case 3:
                    System.out.println("Vendes del empleat: ");
                    int vendes = sc.nextInt();
                    empleats[EmpCount] = new Mostrador(nom, origen, lloc, vendes);
                    EmpCount += 1;
            }
        }

    }

    public void eliminaNeteja(){
        for (Empleat emp:empleats){
            if (emp.getClass().equals(Neteja.class)) {
                emp = null;
            };
        }

    }

    public int quantsCornella(){
        int Count = 0;
        for (Empleat emp:empleats){
            if (emp.getLloc().equalsIgnoreCase("Cornellà")) {
                Count += 1;
            };
        }
        return Count;
    }

    public float costNomina(){
        float total = 0;
        for (Empleat emp:empleats){
            total += emp.salariDiari();
        }
        return total;
    }

    public int quantitatCaixeres(){
        int caixeres = 0;
        for (Empleat emp:empleats){
            if (emp.getClass().equals(Caixer.class)) {
                caixeres += 1;
            };
        }
        return caixeres;
    }

    public float souPromig(){
        float total = costNomina();
        return total/EmpCount;
    }

}
