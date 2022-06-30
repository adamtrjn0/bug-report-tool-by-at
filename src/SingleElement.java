import java.io.PrintWriter;
import java.util.Scanner;

public class SingleElement extends Element {
    private String name;
    private String content;

    SingleElement(String name) {
        setName(name);
    }

    @Override
    public void add() {
        Scanner addScanner = new Scanner(System.in);
        if (getContent() != null) {
            read();
            edit();
        } else {
            System.out.println(getName() + ":");
            setContent(addScanner.nextLine());
        }

    }


    @Override
    public void edit() {
        Scanner editScannerChoice = new Scanner(System.in);
        Scanner editScannerContent = new Scanner(System.in);
        int choice;
        System.out.println("Edit? 1.Yes 2.No");
        if (editScannerChoice.hasNextInt()) {
            choice = editScannerChoice.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(getName() + ":");
                    setContent(editScannerContent.nextLine());
                    break;
                default:
                    break;
            }
        } else {
            wrongInputInfo(editScannerChoice);
        }


    }

    @Override
    public void read() {
        System.out.println(getName() + ":");
        System.out.println(getContent());
    }


    @Override
    public void saveToFile(PrintWriter printWriter) {
        printWriter.println(getName() + ":");
        printWriter.println(getContent());

    }

    public void clear() {
        setContent(null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
