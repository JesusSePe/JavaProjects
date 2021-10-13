package Abstracto;

public class Principal {
    public static void main(String[] args) {
        figura[] f = new figura[5];
        f[0]=new Circulo(3,4,6);
        f[1]=new Rectangulo(3,88);

        for (figura fig:f){
            if(fig instanceof Circulo) {
                System.out.println("El area del circulo es: "+fig.calcularArea());
            }
            else {
                System.out.println("El area del rectangulo es: "+fig.calcularArea());
            }
        }
    }
}
