import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHandler {
    FileWriter fileWriter;
    PrintWriter printWriter;


    public static String readFileAsString() throws Exception {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get("savePath.txt")));
        return data;
    }

    public void saveFile(String fileName, Element[] list) throws Exception {
        String saveDirectory = readFileAsString();
        fileWriter = new FileWriter(saveDirectory + fileName + ".txt");
        printWriter = new PrintWriter(fileWriter);
        for (Element obj : list) {
            obj.saveToFile(printWriter);
        }
        printWriter.close();
        System.out.println("File saved properly!");
    }

}
