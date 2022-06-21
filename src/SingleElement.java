import java.util.Scanner;

public class SingleElement extends Element{
    private String name;
    private String content;
    Scanner scanner;
    Scanner scanner2;

    SingleElement(String name){
        setName(name);
    }

    @Override
    public void add() {
        scanner = new Scanner(System.in);

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
        int choice;
        System.out.println("Edit? 1.Yes 2.No");
        choice = scanner2.nextInt();
        switch (choice){
            case 1:
                System.out.println(getName() + ":");
                setContent(scanner.nextLine());
                break;
            default:
                break;
        }





    }

    @Override
    public void read() {
        System.out.println(getName() + ":");
        System.out.println(getContent());
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
