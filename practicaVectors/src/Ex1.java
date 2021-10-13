import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        String[] Letras = {"T", "R", "W", "A", "G", "H", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        Scanner sc=new Scanner(System.in);
        System.out.print("Entra el dni: ");
        int dni=sc.nextInt();

        System.out.println("La letra es: "+Letras[dni%23]);
    }
}
