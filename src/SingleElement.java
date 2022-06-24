import java.io.PrintWriter;
import java.util.Scanner;

public class SingleElement extends Element{
    private String name;
    private String content;
    Scanner scanner = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);

    SingleElement(String name){
        setName(name);
    }

    @Override
    public void add() {
        if (getContent() != null) {
           read();
           edit();
        }
        else {


        System.out.println(getName() + ":");
        setContent(scanner.nextLine());
    }
        }



    @Override
    public void edit() {
        Scanner editScanner = new Scanner(System.in);
        int choice;
        System.out.println("Edit? 1.Yes 2.No");
        if (editScanner.hasNextInt()) {
            choice = editScanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(getName() + ":");
                    setContent(editScanner.nextLine());
                    break;
                default:
                    break;
            }
        }else {
            wrongInputInfo(editScanner);
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
