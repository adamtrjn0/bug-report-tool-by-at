import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        ReportElements test = new ReportElements();
        try {
            test.selectElement();
        }
        catch (IOException exc){
            System.out.println("Coś się zjebało z zapisem!!!!!!!!");
        }
    }
}
