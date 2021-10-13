import java.util.Scanner;

public class Funciones {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entra dos numeros: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        // Suma1

        // Para utilizar un método hay que crear un objeto
        // de la clase a al aque pertenece el método

        // Para crear un objeto hay que llamar al constructor de la clase.
        // El constructor de la clase tiene el mismo nombre que la clase.

        Funciones objeto=new Funciones();

        objeto.suma1();
        objeto.suma2(num1, num2);
        System.out.println(objeto.suma3());
        System.out.println(objeto.suma4(num1, num2));
    }
    public void suma1() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entra dos numeros: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        System.out.println(num1+num2);
    }
    public void suma2(int num1, int num2) {
        System.out.println(num1+num2);
    }
    public int suma3() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entra dos numeros: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        return num1+num2;
    }
    public int suma4(int num1, int num2){

        return num1+num2;
    }
}
