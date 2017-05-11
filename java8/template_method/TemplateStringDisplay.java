import java.util.stream.IntStream;

public class TemplateStringDisplay extends AbstractDisplay {
    private String string;
    private int width;

    public TemplateStringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    public void open() {
        printLine();
    }

    public void print() {
        System.out.println("|" + string + "|");
    }

    public void close() {
        printLine();
    }

    public void printLine() {
        System.out.print("+");
        IntStream.range(0, width).forEach(i -> System.out.print("-"));
        System.out.println("+");
    }
}