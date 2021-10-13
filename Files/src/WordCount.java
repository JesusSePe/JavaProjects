import java.io.File;
import java.io.FileWriter;
import java.util.Hashtable;
import java.util.Optional;

public class WordCount {
    private File file;
    public WordCount() {

    }

    public WordCount(String fileName) {
        this.file = new File(fileName);
    }

    public static void main(String[] args) {
        WordCount wc = new WordCount(args[1]);
//        String fileData = wc.fileRead();
        String dataClean = wc.fileFilter();
        wc.createHash();
        wc.writeFile(Optional.ofNullable(args[2]));
//        wc.fillHash();
    }

    private void writeFile(Optional<String> pathName) {
        String path;
        FileWriter fw = new FileWriter();
        if (pathName.isPresent()) {
            path = pathName.toString();

        }else {
            path = "./WordCount.txt";
        }
    }

    private Hashtable<String,Integer> createHash(){
        Hashtable<String,Integer> ht = new Hashtable<>();
        return null;

    }

    private String fileFilter() {
        return null;

    }

}