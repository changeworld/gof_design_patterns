public class PrinterProxy implements Printable {
    private String name;
    private Printer real;

    public PrinterProxy() {
    }

    public PrinterProxy(String name) {
        this.name = name;
    }

    public String getPriterName() {
        return name;
    }

    public synchronized void setPriterName(String name) {
        if (real != null) {
            real.setPriterName(name);
        }
        this.name = name;
    }

    public void print(String string) {
        realize();
        real.print(string);
    }

    public synchronized void realize() {
        if (real == null) {
            real = new Printer(name);
        }
    }
}