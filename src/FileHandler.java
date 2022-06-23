import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandler {
FileWriter fileWriter;
PrintWriter printWriter;
final String SAVE_PATH = "C:\\Users\\adamt\\OneDrive\\Pulpit\\Testy\\";

public void saveFile(String fileName ,Element[] list) throws IOException {
    fileWriter = new FileWriter(SAVE_PATH + fileName);
    printWriter = new PrintWriter(fileWriter);
    for (Element obj : list){
        obj.saveToFile(printWriter);
    }
    printWriter.close();
    System.out.println("File saved properly!");
}

}
