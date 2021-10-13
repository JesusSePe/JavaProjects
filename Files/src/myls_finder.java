import java.io.File;

public class myls_finder {

    public static void main(String[] args){

        String dirName = args[1]; // Save the directory string

        File file = new File(dirName); // Using the File API, create a new file with an abstract name, given the full directory


        if (file.isFile()) {
            System.out.println("This is a real file.");
        } else {
            System.out.println("This is not a real file.");
        }
    }

}