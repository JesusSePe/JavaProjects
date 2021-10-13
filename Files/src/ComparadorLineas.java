import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ComparadorLineas {
    private ArrayList<String> fichero1, fichero2;

    public ComparadorLineas() {
        // TODO Auto-generated constructor stub
    }

    public ComparadorLineas(String ruta1,String ruta2) throws IOException {
        // TODO Auto-generated constructor stub

        this.fichero1 = readArgs(ruta1);
        this.fichero2 = readArgs(ruta2);

    }

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        ComparadorLineas cf = new ComparadorLineas(args[1],args[2]);
        cf.printresults();

    }

    //-Funciones

    private ArrayList<String> readArgs(String ruta) throws IOException {
        ArrayList<String> fichero = new ArrayList<String>();


        if (new File(ruta).exists()) {

            FileReader fileReader = new FileReader(new File(ruta));
            BufferedReader br = new BufferedReader(fileReader);
            String linea = br.readLine();
            while (linea != null) {
                fichero.add(linea);
                linea = br.readLine();
            }

        }
        return fichero;

    }

    private boolean hayLinea(int index, ArrayList<String> fichero) {
        if (index < fichero.size()) {
            return true;
        }
        return false;
    }

    public void printresults() {

        int i = 0;
        int iguales = 0;
        int diferentes = 0;

        while (hayLinea(i,fichero1)||hayLinea(i,fichero2)) {
            if(hayLinea(i,fichero1) && hayLinea(i,fichero2)) {
                if (fichero1.get(i).equals(fichero2.get(i))) {
                    System.out.println("Linea: "+(i+1)+" fichero1: "+fichero1.get(i)+" \tfichero2: "+fichero2.get(i)+  " IGUAL");
                    iguales++;
                }else {
                    System.out.println("Linea: "+(i+1)+" fichero1: "+fichero1.get(i)+" \tfichero2: "+fichero2.get(i)+  " DIFERENTE");
                    diferentes++;
                }
            }else {
                if(!hayLinea(i,fichero1)) {
                    System.out.println("Linea: "+(i+1)+" fichero1: ---NO LINE--- \tfichero2: "+fichero2.get(i)+  " DIFERENTE");
                    diferentes++;
                } else {
                    System.out.println("Linea: "+(i+1)+" fichero1: "+fichero1.get(i)+" \tfichero2: ---NO LINE--- DIFERENTE");
                    diferentes++;
                }
            }

            i++;
        }
        System.out.println("-----FIN DE LA COMPARACION------");
        System.out.println("Lineas iguales:    "+ iguales);
        System.out.println("Lineas difernetes: "+ diferentes);
        System.out.println("Gracias por confiar en 'ComparadorLineas'");
    }

}