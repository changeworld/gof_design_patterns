import java.util.ArrayList;
import java.util.Iterator;

public class VisitorDirectory extends VisitorEntry {
    private String name;
    private ArrayList dir = new ArrayList();

    public VisitorDirectory(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        int size = 0;
        Iterator it = dir.iterator();
        while (it.hasNext()) {
            VisitorEntry entry = (VisitorEntry) it.next();
            size += entry.getSize();
        }
        return size;
    }

    public VisitorEntry add(VisitorEntry entry) {
        dir.add(entry);
        return this;
    }

    public Iterator iterator() {
        return dir.iterator();
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
