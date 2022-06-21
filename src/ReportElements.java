import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReportElements {
    SingleElement title = new SingleElement("Title");
    SingleElement description = new SingleElement("Description");
    SingleElement actualResult = new SingleElement("Actual result");
    SingleElement expectedResult = new SingleElement("Expected result");
    ListElement preConditions = new ListElement("Preconditions");
    ListElement stepsToDo = new ListElement("Steps to do");


    public void selectElement() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Select some option:\n1.Title\n2.Desc\n3.Preconds\n4.Steps" +
                    "\n5.Actual res\n6.Expected res\n7.Repeatability");
            int inputNumber = scanner.nextInt();
            switch (inputNumber){
                case 1:
                    title.add();
                    break;
            }
            




        }
    }
}
