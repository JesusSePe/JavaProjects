package ArrayList;

import Abstracto.Circulo;

import java.util.ArrayList;
import java.util.Scanner;

public class FRmFigures {
    public static void main(String[] args) {
        ArrayList<Figura> a = new ArrayList<Figura>();
        Scanner lector = new Scanner(System.in);

        int optn;
        do {
            System.out.println("1.-Triangle\n2.-Cercle\n3.-Quadrat\n4.-Contar Figuras\n5.-Sumar Areas");
            optn = lector.nextInt();
            String color;
            switch (optn) {
                case 1:
                    lector.nextLine();
                    System.out.println("color: ");
                    color = lector.nextLine();
                    System.out.println("base: ");
                    double base = lector.nextDouble();
                    System.out.println("altura: ");
                    double altura = lector.nextDouble();

                    Triangle t = new Triangle(color, base, altura);
                    a.add(t);
                    break;
                case 2:
                    lector.nextLine();
                    System.out.println("color: ");
                    color = lector.nextLine();
                    System.out.println("radi: ");
                    double radi = lector.nextDouble();

                    Cercle c = new Cercle(color, radi);
                    a.add(c);
                    break;
                case 3:
                    lector.nextLine();
                    System.out.println("color: ");
                    color = lector.nextLine();
                    System.out.println("lado: ");
                    double lado = lector.nextDouble();

                    Quadrat q = new Quadrat(color, lado);
                    a.add(q);
                    break;
                case 4:
                    int num_t=0, num_q=0, num_c=0;
                    for(Figura f:a){
                        if(f instanceof Cercle){
                            num_c += 1;
                        } else if (f instanceof Triangle) {
                            num_t += 1;
                        } else if (f instanceof Quadrat) {
                            num_q += 1;
                        }
                    }
                    System.out.println("Hi ha "+num_c+" cercles, "+num_q+" quadrats i "+num_t+" triangles.");
                    break;
                case 5:
                    double sum=0;
                    for(Figura f:a){
                        if (f instanceof Cercle) {
                            sum += f.getArea();
                        }
                    }
                    System.out.println("El total de las areas de los circulos es de "+sum);
                    break;
            }
        } while(optn > 0 && optn < 6);

    }

}
