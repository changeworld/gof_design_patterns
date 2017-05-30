public class ProxyMain {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println("Now name is " + p.getPriterName() + ".");
        p.setPriterName("Bob");
        System.out.println("Now name is " + p.getPriterName() + ".");
        p.print("Hello, world.");
    }
}