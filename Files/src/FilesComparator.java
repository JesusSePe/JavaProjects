import java.io.*;
import java.util.ArrayList;

public class FilesComparator {
    private ArrayList<String> file1, file2;
    // Realiza un programa que compare dos ficheros linea por linea y nos indique si su contenido es igual. Recibe como parámetro el nombre/ruta de los dos ficheros
    public static void main(String[] args) throws IOException {
        FilesComparator fc = new FilesComparator(args[1], args[2]);
        fc.printResults();
    }
    // Constructor. Detects the differences between both files.
    public FilesComparator(String route1, String route2) throws IOException{
        this.file1 = readArgs(route1);
        this.file2 = readArgs(route2);
    }
    // Print all differences (Stored in dif1 and dif2 arrays)
    public void printResults() {
        int i = 0;
        while (file1.get(i) != null || file2.get(i) != null){
            if(file1.get(i).equals(file2.get(i))){
                System.out.println("Line" + i + " Both lines are equal");
            } else {
                System.out.println("Line" + i + " Both lines are different");
            }
            i++;
        }
    }

    // Functions
    private ArrayList<String> readArgs(String route) throws IOException {
        ArrayList <String> file = new ArrayList<String>();
        if(new File(route).isFile()){
            FileReader fileReader = new FileReader(new File(route));
            BufferedReader br = new BufferedReader(fileReader);
            String line = br.readLine();
            while(line != null){
                file.add(line);
                line = br.readLine();
            }
        }
        return file;
    }
}