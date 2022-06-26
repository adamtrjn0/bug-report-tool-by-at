import java.io.PrintWriter;
import java.util.Scanner;

public class RepeatabilityElement extends Element {
    int tries;
    int fails;
    String name;
    String content;

    @Override
    public void add() {
        if (content != null) {
            read();
            edit();
        } else {
            boolean loopOn = true;
            Scanner addScanner = new Scanner(System.in);
            do {
                System.out.println("How many tries?");
                if (addScanner.hasNextInt()) {
                    tries = addScanner.nextInt();
                    System.out.println("How many failed?");
                    if (addScanner.hasNextInt()) {
                        fails = addScanner.nextInt();
                        content = name + ": " + countPercents() + "% " + fails + "/" + tries;
                        loopOn = false;
                    }
                }
            } while (loopOn);
        }
    }

    @Override
    public void edit() {
        boolean loopOn = true;
        Scanner addScanner = new Scanner(System.in);
        do {
            System.out.println("How many tries?");
            if (addScanner.hasNextInt()) {
                tries = addScanner.nextInt();
                System.out.println("How many failed?");
                if (addScanner.hasNextInt()) {
                    fails = addScanner.nextInt();
                    content = name + ": " + countPercents() + "% " + fails + "/" + tries;
                    loopOn = false;
                }
            }
        } while (loopOn);
    }


    @Override
    public void read() {
        System.out.println(content);


    }

    public double countPercents() {
        double result;
        result = 100 / (tries / fails);
        return result;

    }

    @Override
    public void saveToFile(PrintWriter printWriter) {

    }
}
