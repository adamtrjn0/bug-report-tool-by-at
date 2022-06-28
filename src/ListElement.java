import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ListElement extends Element {
    ArrayList<String> list = new ArrayList<>();
    private String name;
    private String content;


    ListElement(String name) {
        setName(name);
    }


    public void addtoList() {
        Scanner addToListScannerString = new Scanner(System.in);
        Scanner addToListScannerInt = new Scanner(System.in);
        int index = 0;
        Boolean loopOn = true;
        System.out.println("Text:");
        setContent(addToListScannerString.nextLine());
        list.add(index, getContent());
        while (loopOn) {
            int choice;
            System.out.println("Add another step?\n1.Yes 2.No");
            if (addToListScannerInt.hasNextInt()) {
                choice = addToListScannerInt.nextInt();
                switch (choice) {
                    case 1:
                        index++;
                        System.out.println("Text:");
                        setContent(addToListScannerString.nextLine());
                        list.add(index, getContent());
                        break;
                    default:
                        loopOn = false;
                }

            } else {
                wrongInputInfo(addToListScannerInt);
            }
        }

    }

    @Override
    public void add() {
        int choice;
        Scanner addScaner = new Scanner(System.in);

        if (!list.isEmpty()) {
            read();
            System.out.println("Edit? 1.Yes 2.No");
            if (addScaner.hasNextInt()) {
                choice = addScaner.nextInt();
                switch (choice) {
                    case 1:
                        edit();
                        break;
                    default:
                        break;
                }

            } else {
                wrongInputInfo(addScaner);
            }
        } else {
            addtoList();
        }

    }


    @Override
    public void edit() {
        Scanner editScanner = new Scanner(System.in);
        int index;
        int choice;
        Boolean loopOn = true;
        while (loopOn) {
            System.out.println("Which step do you want to edit?");
            if (editScanner.hasNextInt()) {
                index = editScanner.nextInt();
                if (index > 1 | index < list.size()) ;
                {
                    System.out.println("Text:");
                    setContent(editScanner.next());
                    list.set((index - 1), getContent());
                    System.out.println("Edit again? 1.Yes 2.No");
                    if (editScanner.hasNextInt()) {
                        choice = editScanner.nextInt();
                        switch (choice) {
                            case 1:
                                index++;
                                break;
                            default:
                                loopOn = false;
                                break;
                        }
                    }
                    else {
                        wrongInputInfo(editScanner);
                    }
                }

            } else {
                wrongInputInfo(editScanner);
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
