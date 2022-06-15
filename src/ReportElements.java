import java.util.ArrayList;
import java.util.Scanner;

public class ReportElements {
    private String title;
    private String description;
    private ArrayList<String> preConditions = new ArrayList<>();
    private ArrayList<String> stepsToDo = new ArrayList<>();
    private String expectedResult;
    private String actualResult;
    private String repeatability;

    public void printAll(){
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Preconditions: "); showList(preConditions);
//        System.out.println("Title: " + title);
//        System.out.println("Title: " + title);
//        System.out.println("Title: " + title);
//        System.out.println("Title: " + title);


    }
    public void editStep(ArrayList<String> list) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int decision;
        String text;
        do {
            System.out.println("Which step do you want to edit?");
            decision = (scanner.nextInt() - 1);
        } while (decision < 0 || decision > list.size());

        System.out.println("Text:");
        text = scanner2.nextLine();
        list.set(decision, text);

    }

    public void addStep(ArrayList<String> list) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int decision;
        Boolean loopOn;

        do {
            System.out.println("Write:");
            list.add(scanner.nextLine());
            System.out.println("Add another step?");
            decision = scanner2.nextInt();
            if (decision == 1) {
                loopOn = true;
            } else {
                loopOn = false;
            }


        } while (loopOn);


    }

    public void showList(ArrayList<String> list) {
        int index = 1;
        for (String i : list) {
            System.out.print(index);
            System.out.println("." + i);
            index++;
        }

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getPreConditions() {
        return preConditions;
    }

    public void setPreConditions(ArrayList<String> preConditions) {
        this.preConditions = preConditions;
    }

    public ArrayList<String> getStepsToDo() {
        return stepsToDo;
    }

    public void setStepsToDo(ArrayList<String> stepsToDo) {
        this.stepsToDo = stepsToDo;
    }

    public String getExpectedResult() {
        return expectedResult;
    }

    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;
    }

    public String getActualResult() {
        return actualResult;
    }

    public void setActualResult(String actualResult) {
        this.actualResult = actualResult;
    }

    public String getRepeatability() {
        return repeatability;
    }

    public void setRepeatability(String repeatability) {
        this.repeatability = repeatability;
    }

    public void selectElement() {
        while (true) {
            String textInput;
            Scanner scanner = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);

            System.out.println("Select some option:\n1.Title\n2.Desc\n3.Preconds\n4.Steps" +
                    "\n5.Actual res\n.6.Expected res\n7.Repeatability");
            int inputNumber = scanner.nextInt();

            switch (inputNumber) {
                case 1:
                    if (title != null) {
                        System.out.println(title);
                    }
                    System.out.println("Title:");
                    textInput = scanner2.nextLine();
                    title = textInput;
                    break;
                case 2:
                    if (description != null) {
                        System.out.println(description);
                    }
                    System.out.println("Desctiption:");
                    textInput = scanner2.nextLine();
                    description = textInput;
                    break;
                case 3:
                    if (!preConditions.isEmpty()) {
                        showList(preConditions);
                        editStep(preConditions);
                        showList(preConditions);

                    } else {

                        addStep(preConditions);
                    }

                    break;
                case 9:
                    printAll();
                    break;

                default:
                    System.out.println("Ta funkcja na razie nie jest zaimplementowana");
            }
        }
    }
}
