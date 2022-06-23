import java.io.IOException;
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
    Element[] elementsArr = {title, description, preConditions, stepsToDo, actualResult, expectedResult};
    FileHandler fileHandler = new FileHandler();


    public void selectElement() throws IOException {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Select some option:\n1.Title\n2.Desc\n3.Preconds\n4.Steps" +
                    "\n5.Actual res\n6.Expected res\n0.Show results\n9.Save to file");
            int inputNumber = scanner.nextInt();
            if (inputNumber == 0) {
                for (Element obj : elementsArr) {
                    obj.read();

                }
            } else if (inputNumber == 9) {
                String fileName;
                do {
                    System.out.println("Name your file:");
                    fileName = scanner2.nextLine();
                } while (fileName == null);

                fileHandler.saveFile(fileName, elementsArr);
            } else if (inputNumber <= elementsArr.length) {
                elementsArr[inputNumber - 1].add();
            } else {
                System.out.println("Wrong input, please use numbers from 0-6");
            }


        }
    }

}
