import java.io.PrintWriter;
import java.util.Scanner;

public abstract class Element {
    public abstract void add();
    public abstract void edit();
    public abstract void read();
    public abstract void clear();
    public abstract void saveToFile(PrintWriter printWriter);
    Scanner scanner;
    public void wrongInputInfo(Scanner scanner){
        System.out.println("Only integer values allowed!");
        scanner.nextLine();
    }

    public static void cleanTemplate(Element [] array){
        for (Element element : array){
            element.clear();
        }

    }
}
