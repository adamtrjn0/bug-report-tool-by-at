import java.io.PrintWriter;
import java.util.Scanner;

public class RepeatabilityElement extends Element {
    private int tries;
    private int fails;
    private String name;
    private String content;

    RepeatabilityElement(String name) {
        this.name = name;
    }

    @Override
    public void add() {
        if (getContent() != null) {
            read();
            edit();
        } else {
            boolean loopOn = true;
            Scanner addScanner = new Scanner(System.in);
            do {
                System.out.println("How many tries?");
                if (addScanner.hasNextInt()) {
                    setTries(addScanner.nextInt());

                    System.out.println("How many failed?");

                    if (addScanner.hasNextInt()) {
                        setFails(addScanner.nextInt());
                        if (countPercents() != 0) {

                            setContent( countPercents() + "% " + getFails() + "/" + getTries());
                            loopOn = false;

                        } else {
                            System.out.println("Amount of fails should be lower than tries or equal");
                        }
                    }
                }

            } while (loopOn);
        }
    }

    @Override
    public void edit() {
     read();
     add();
    }


    @Override
    public void read() {

        System.out.println(getName() + ": \n" + getContent());


    }

    @Override
    public void clear() {
        setContent(null);
        setTries(0);
        setFails(0);
    }

    public double countPercents() {
        double result;
        if (getTries() >= getFails()) {
            result = 100 / (getTries() / getFails());
            return result;
        } else setFails(0);
        setTries(0);
        return 0;


    }

    @Override
    public void saveToFile(PrintWriter printWriter) {
        printWriter.println(getName() + ":");
        printWriter.println(getContent() + "\n");

    }

    public int getTries() {
        return tries;
    }

    public void setTries(int tries) {
        if (tries > 0) {
            this.tries = tries;
        }
        else{
            this.tries = 5;
            System.out.println("Amount of tries set to default (5)");
        }
    }

    public int getFails() {
        return fails;
    }

    public void setFails(int fails) {
        this.fails = fails;
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
