public class VisitorFile extends VisitorEntry {
    private String name;
    private int size;

    public VisitorFile(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.size;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
