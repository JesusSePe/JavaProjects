package Project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Operacion {
    public static void main(String[] args) {
        accederFicheroTry();
        System.out.println("El programa continua");
        try { // Las funciones con Throws, hay que envolverlas en try/catch.
            accederFicheroThrows();
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no se ha encontrado");
        }
        System.out.println("El programa continua");
        Scanner sc = new Scanner(System.in);
        System.out.println("Mail: ");
        String mail = sc.nextLine();
        try {
            comprobarMail(mail);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("El programa ha llegado al final");
    }
    public static void accederFicheroTry() {
        /*Excepcion de no obligada captura*/

        //int num1=9, num2=0;

        //System.out.println(num1/num2);

        /*Excepcion de obligada captura*/
        Scanner sc = null;
        try {
            sc = new Scanner(new File("enters.txt"));
            for(int i=0;i<4;i++) {
                System.out.println(sc.nextInt());
            }
            //System.out.println("La division es: "+num1/num2);
        } catch (FileNotFoundException e) { // + Especifico
            System.out.println("No se puede abrir el archivo");
        } catch (ArithmeticException e){
            //System.out.println("Error en la division");
        } catch (Exception e) { // + Genérico
            System.out.println("Error 2");
        } finally {
            // Siempre se ejecuta
            System.out.println("Finally");
        }
    }
    public static void accederFicheroThrows() throws FileNotFoundException{
        Scanner sc = null;
        sc = new Scanner(new File("enters.txt"));
        for(int i=0;i<4;i++) {
            System.out.println(sc.nextInt());
        }
    }
    public static void comprobarMail(String mail) throws mailException {
        int punto = 0, arroba=0;
        for(int i=0; i<mail.length(); i++) {
            if(mail.charAt(i) == '.')
                punto++;
            if(mail.charAt(i) == '@')
                arroba++;
        }
        if (punto == 1 && arroba == 1) {
            System.out.println("Correcto.");
        }
        else {
            throw new mailException();
        }
    }
}
class mailException extends Exception{
    public mailException() {
    }
    public mailException(String texto) {
        super(texto);
        System.out.println("Error mail");
    }
}
