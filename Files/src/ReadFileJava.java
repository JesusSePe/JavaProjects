import java.io.*;

public class ReadFileJava {
    // Realiza un programa (ReadFileJava.java) que lea el fichero ReadFileJava.java
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader("./src/ReadFileJava.java");
        BufferedReader br = new BufferedReader(fileReader);
        try {
            String linea = br.readLine();
            while(linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
