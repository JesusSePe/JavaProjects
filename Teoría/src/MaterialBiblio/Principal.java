package MaterialBiblio;

import java.util.Scanner;

public class Principal {
    public static void main (String[] args){
        Material vectorMat[]=new Material[3];
        int i=0, opcion=0;
        Scanner sc = new Scanner(System.in);
        String autor, titol, discografica;
        int codi;

        do {
            System.out.println("1.- Llibres\n2.- Discos\nEntra una opcion: ");
            opcion=sc.nextInt();
            sc.nextLine();
            switch(opcion) {
                case 1:
                    System.out.println("Autor: ");
                    autor=sc.nextLine();
                    System.out.println("Titol: ");
                    titol=sc.nextLine();
                    System.out.println("Codi: ");
                    codi=sc.nextInt();
                    sc.nextLine();

                    vectorMat[i]=new Llibre(autor, titol, codi);
                    i++;
                    break;
                case 2:
                    System.out.println("Autor: ");
                    autor=sc.nextLine();
                    System.out.println("Titol: ");
                    titol=sc.nextLine();
                    System.out.println("Codi: ");
                    codi=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nom discografica: ");
                    discografica=sc.nextLine();

                    vectorMat[i]=new Discos(discografica, autor, titol, codi);
                    i++;
                    break;
            }
        }while((opcion>=1 && opcion <=2) && i<3);

        for (Material objeto:vectorMat) {
            System.out.println(objeto);
        }
    }

}
