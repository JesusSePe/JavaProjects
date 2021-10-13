import java.io.File;

public class myls0 {

    public static void main(String[] args){

        String dirName = "/"; // Save the directory string

        File file = new File(dirName); // Using the File API, create a new file with an abstract name, given the full directory

        if (file.isDirectory()) {
            File[] Files = file.listFiles();

            for (File f : Files) {
                System.out.println(f);
            }
        }
    }

}