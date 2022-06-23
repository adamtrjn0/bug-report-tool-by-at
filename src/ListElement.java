import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ListElement extends Element {
    ArrayList<String> list = new ArrayList<>();
    private String name;
    private String content;
    Scanner scanner = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);

    ListElement(String name){
        setName(name);
    }


    public void addtoList() {
        int index = 0;
        Boolean loopOn = true;
        while (loopOn) {
            int choice;
            System.out.println("Text:");
            setContent(scanner.nextLine());
            list.add(index, getContent());
            System.out.println("Add another step?\n1.Yes 2.No");
            choice = scanner2.nextInt();
            switch (choice) {
                case 1:
                    index++;
                    break;
                default:
                    loopOn = false;
            }
        }
    }

    @Override
    public void add() {
        int choice;
        if (!list.isEmpty()){
            read();
            System.out.println("Edit? 1.Yes 2.No");
            choice = scanner2.nextInt();
            switch (choice){
                case 1:
                    edit();
                    break;
                default:
                    break;
            }
        }
        else {
            addtoList();
        }

    }

    @Override
    public void edit() {
        int index;
        int choice;
        Boolean loopOn = true;
        while (loopOn) {
            System.out.println("Which step do you want to edit?");

            index = scanner.nextInt();
            if (index > 1 | index < list.size()) ;
            {
                System.out.println("Text:");
                setContent(scanner2.next());
                list.set((index - 1), getContent());
                System.out.println("Edit again? 1.Yes 2.No");
                choice = scanner2.nextInt();
                switch (choice){
                    case 1:
                        index++;
                        break;
                    default:
                        loopOn = false;
                        break;
                }


            }
        }

    }


    @Override
    public void read() {
        int index = 1;
        System.out.println(getName() + ":");
        for (String i : list) {

            System.out.println(index + "." + i);
            index++;
        }

    }

    @Override
    public void saveToFile(PrintWriter printWriter) {
        int index = 1;
        printWriter.println(getName() + ":");
        for (String i : list) {
            printWriter.println(index + "." + i);
            index++;
        }

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
