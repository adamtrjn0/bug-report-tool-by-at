import java.io.*;
import java.util.Scanner;

public class FileHandler {
    FileWriter fileWriter;
    PrintWriter printWriter;
    private static String saveDirectory;


    public void saveFile(String fileName, Element[] list) throws Exception {
        fileWriter = new FileWriter(getSaveDirectory() + fileName + ".txt");
        printWriter = new PrintWriter(fileWriter);
        for (Element obj : list) {
            obj.saveToFile(printWriter);
        }
        printWriter.close();
        System.out.println("File saved properly!");
    }

    public static String getSaveDirectory() {
        return saveDirectory;
    }

    public static void setSaveDirectory() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Save directory: ");
        saveDirectory = scanner.nextLine();
    }
}
