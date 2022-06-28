import java.io.IOException;

public class BugReportToolByAT {
    public static void main(String[] args) throws IOException {
        ReportElements test = new ReportElements();
        try {
            test.selectElement();
        }
        catch (IOException exc){
            System.out.println("Error, file can't be saved");
        }
    }
}
