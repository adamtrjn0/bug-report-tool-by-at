import java.io.IOException;

public class BugReportToolByAT {
    public static void main(String[] args) throws IOException {
        String userDirectory = System.getProperty("user.dir");
        System.out.println(userDirectory);
        ReportElements test = new ReportElements();
        try {
            test.selectElement();
        }
        catch (IOException exc){
            System.out.println("Error, file can't be saved");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
