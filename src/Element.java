import java.io.PrintWriter;

public abstract class Element {
    public abstract void add();
    public abstract void edit();
    public abstract void read();
    public abstract void saveToFile(PrintWriter printWriter);

}
