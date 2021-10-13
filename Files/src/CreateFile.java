import java.io.*;

public class CreateFile {
    private File file;
    public CreateFile(String fileName){
        this.file = new File(fileName);
    }

    public CreateFile(String fileName, String pathName){
        this.file = new File(pathName +File.pathSeparator+ fileName);
    }

    public static void main (String[] args) throws IOException {
        CreateFile cf = new CreateFile(args[1]);
        cf.writeInFile("Yo sólo puedo enseñarte la puerta, eres tú quien tiene que atravesarla");
    }

    private void writeInFile(String s) throws IOException {
        FileWriter fw = new FileWriter(this.file, true);
        fw.write(s);
        //BufferedWriter bw = new BufferedWriter(fw);
        fw.close();
    }

}

