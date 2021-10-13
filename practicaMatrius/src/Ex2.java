import java.util.Scanner;
public class Ex2 {
    int [][] matrizNum=new int[3][3];
    Scanner lector = new Scanner(System.in);
    int valu = 0;
    for(int i=0;i<matrizNum.length;i++) {
        for (int j=0;j<matrizNum[i].length;j++) {
            boolean cool = false;
            while (cool = false){
                System.out.println("Inserta la posición "+i+", "+j);
                valu=lector.nextInt();
                if (valu > 0) {
                    cool = true;
                    matrizNum[i][j]=valu;
                }
            }
        }
    }
}
