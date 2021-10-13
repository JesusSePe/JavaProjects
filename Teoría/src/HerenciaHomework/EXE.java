package HerenciaHomework;

public class EXE {
    public static void main (String[] args) {
        Electrodomestic vectorElectro[] = new Electrodomestic[10];
        vectorElectro[0] = new Rentadora();
        vectorElectro[1] = new Rentadora(170, 200);
        vectorElectro[2] = new Rentadora(700, 350);
        vectorElectro[3] = new Rentadora(1500, 500, "vermell", "C", 50);
        vectorElectro[4] = new Rentadora(150, 100, "negre", "F", 3);
        vectorElectro[5] = new Televisio();
        vectorElectro[6] = new Televisio(200, 20);
        vectorElectro[7] = new Televisio(200, 15);
        vectorElectro[8] = new Televisio(350, 10, "blau", "A", 15.2f, true);
        vectorElectro[9] = new Televisio(500, 4, "negre", "A", 50.5f, true);

        for (Electrodomestic ele:vectorElectro) {
            System.out.println("El preu final es de: "+ ele.preuFinal()+"€");
        }
    }
}
