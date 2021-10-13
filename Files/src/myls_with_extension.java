import java.io.File;

public class myls_with_extension {

    public static void main(String[] args){

        String dirName = args[1]; // Save the directory string
        File file = new File(dirName); // Using the File API, create a new file with an abstract name, given the full directory
        String extension = args[2]; // Save the file extension
        if (file.isDirectory()) { // Filter and allow only folders
            File[] Files = file.listFiles(); // Get all files and folders at the provided path
            for (File f : Files) {
                if (f.isFile() && f.getName().endsWith(extension)){ // Print only files that ends with the provided extension
                    System.out.println(f);
                }
            }
        } else {
            System.out.println("This directory doesn't exist");
        }
    }

}
