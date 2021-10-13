import java.io.File;

public class myls_full {

    public static void main(String[] args){

        String dirName = args[1]; // Save the directory string

        File file = new File(dirName); // Using the File API, create a new file with an abstract name, given the full directory

        if (file.isDirectory()) {
            File[] Files = file.listFiles();

            System.out.println("File name \t\t\t\t readable \t\t\t\t writable \t\t\t\t size \t\t\t\t type");
            for (File f : Files) {
                String type = "";
                if (f.isFile()){
                    type = "File";
                } else {
                    type = "Directory";
                }
                System.out.println(f.getName() + "\t\t\t" + f.canRead() + "\t\t\t" + f.canWrite() + "\t\t\t" + f.length() + "\t\t\t" + type);
            }
        }
    }

}