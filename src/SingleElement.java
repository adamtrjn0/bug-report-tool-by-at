import java.util.Scanner;

public class SingleElement extends Element {
    String name;
    String content;
    Scanner scanner;
    Scanner scanner2;

    @Override
    public void add() {
        scanner = new Scanner(System.in);
        if (content != null) {
            read();
            edit();
        }
        else {
            System.out.println(name + ":");
            content = scanner.nextLine();
        }
    }


    @Override
    public void edit() {
        int choice;
        System.out.println("Edit? 1.Yes 2.No");
        choice = scanner2.nextInt();
        switch (choice) {
            case 1:
                System.out.println(name + ":");
                content = scanner.nextLine();
                break;
            default:
                break;
        }
    }

    @Override
    public void read() {
        System.out.println(name + ":");
        System.out.println(content);
    }


}
