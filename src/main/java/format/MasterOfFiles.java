package format;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MasterOfFiles {
    String hostDirectoryName = DEFAULT_HOST_DIRECTORY_NAME;
    static String DEFAULT_HOST_DIRECTORY_NAME = "D:\\Esquisse";

    public  String subDirectoryName = DEFAULT_SUB_DIRECTORY_NAME;
    static String DEFAULT_SUB_DIRECTORY_NAME = "DefaultSketch" ;

    public void save(String[] resultsToSave, String name){

        String filePathName = hostDirectoryName+"\\"+subDirectoryName+"\\"+name+".ly";
        String subDirectoryPathName = hostDirectoryName+"\\"+subDirectoryName;

        try {
            // Check if the subdirectory exists, and create it if it doesn't
            Path pathSubDirectory = Paths.get(subDirectoryPathName);
            if (!Files.exists(pathSubDirectory)) {
                Files.createDirectory(pathSubDirectory);
            }
            // Check if the file exists, and create it if it doesn't
            File file = new File(filePathName);
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter writer = new FileWriter(file);
            for (String data: resultsToSave) {
                writer.write(data+"\n");
            }
            writer.close(); // Close the writer when you're done
            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String[] toSave = new String[]{"a","b","c"};
        (new MasterOfFiles()).save(toSave,"titi");
    }

}
