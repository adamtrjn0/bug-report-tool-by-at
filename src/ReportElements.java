import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ReportElements {

    SingleElement title = new SingleElement("Title");
    SingleElement description = new SingleElement("Description");
    SingleElement environment = new SingleElement("Environment");
    SingleElement actualResult = new SingleElement("Actual result");
    SingleElement expectedResult = new SingleElement("Expected result");
    ListElement preConditions = new ListElement("Preconditions");
    ListElement stepsToDo = new ListElement("Steps to do");
    RepeatabilityElement repeatability = new RepeatabilityElement("Repeatability");
    Element[] elementsArr = {title, description, environment, preConditions, stepsToDo, actualResult, expectedResult,
            repeatability};
    FileHandler fileHandler = new FileHandler();
    Boolean loopOn = true;

    public void selectElement() throws IOException, InputMismatchException {
        while (loopOn) {
            Scanner scanner = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Select some option:\n1.Title\n2.Desc\n3.Environment\n4.Preconds\n5.Steps" +
                    "\n6.Actual res\n7.Expected res\n8.Repeatability\n9.Save to file\n10.Quit\n11.Clear all\n0.Show results");

            int inputNumber = scanner.nextInt();

            switch (inputNumber) {
                case 0:
                    for (Element obj : elementsArr) {
                        obj.read();
                    }
                    break;
                case 9:
                    String fileName;
                    do {
                        System.out.println("Name your file:");
                        fileName = scanner2.nextLine();
                    } while (fileName == null);
                    fileHandler.saveFile(fileName, elementsArr);
                    break;
                case 10:
                    System.out.println("Goodbye!");
                    loopOn = false;
                    break;
                case 11:
                    Element.cleanTemplate(elementsArr);
                    System.out.println("Template cleared!");
                    break;
                case 1, 2, 3, 4, 5, 6, 7, 8:
                    elementsArr[inputNumber - 1].add();
                    break;
                default:
                    System.out.println("Wrong input, please use numbers from 0-11");
            }


        }
    }

}
