package EjercicioHerencia;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        inmuebles vectorInmuebles[] = new inmuebles[3];
        int i = 0, opcion;
        Scanner scan = new Scanner(System.in);
        int anios, metros, numeroPiso, numeroVentanas;
        String direccion;
        float precio;
        boolean estado;

        do{
            System.out.println("1.- Pisos\n2.-Locales\nEscull una opcio: ");
            opcion = scan.nextInt();
            scan.nextLine();
            switch (opcion){
                case 1:

                    // Pedir informacion
                    System.out.println("Dirección: ");
                    direccion = scan.nextLine();
                    System.out.println("Anios: ");
                    anios = scan.nextInt();
                    System.out.println("Metros: ");
                    metros = scan.nextInt();
                    System.out.println("Precio: ");
                    precio = scan.nextFloat();
                    scan.nextLine();
                    System.out.println("Estado: ");
                    estado = scan.nextBoolean();
                    System.out.println("Numero de Piso: ");
                    numeroPiso = scan.nextInt();

                    // Llamada al constructor
                    vectorInmuebles[i] = new pisos(direccion, anios, metros, precio, estado, numeroPiso);
                    i++;
                    break;
                case 2:
                    // Pedir informacion
                    System.out.println("Dirección: ");
                    direccion = scan.nextLine();
                    System.out.println("Anios: ");
                    anios = scan.nextInt();
                    System.out.println("Metros: ");
                    metros = scan.nextInt();
                    System.out.println("Precio: ");
                    precio = scan.nextFloat();
                    scan.nextLine();
                    System.out.println("Estado: ");
                    estado = scan.nextBoolean();
                    System.out.println("Numero de ventanas: ");
                    numeroVentanas = scan.nextInt();

                    // Llamada al constructor
                    vectorInmuebles[i] = new local(direccion, anios, metros, precio, estado, numeroVentanas);
                    i++;
                    break;
            }
        }while(i<=2);

        for (inmuebles inmueble:vectorInmuebles){
            inmueble.calcularPrecio();
            System.out.println(inmueble);
        }
    }
}
