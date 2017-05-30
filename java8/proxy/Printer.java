public class Printer implements Printable {
    private String name;

    public Printer() {
        heavyJob("Generating Printer instance");
    }

    public Printer(String name) {
        this.name = name;
        heavyJob("Generating Printer instance (" + name + ")");
    }

    public String getPriterName() {
        return name;
    }

    public void setPriterName(String name) {
        this.name = name;
    }

    public void print(String string) {
        System.out.println("=== " + name + " ===");
        System.out.println(string);
    }

    public void heavyJob(String msg) {
        System.out.print(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.print(".");
        }
        System.out.println("Finish.");
    }
}