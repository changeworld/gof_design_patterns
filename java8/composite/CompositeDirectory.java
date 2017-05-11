import java.util.ArrayList;
import java.util.Iterator;

public class CompositeDirectory extends CompositeEntry {
    private String name;
    private ArrayList directory = new ArrayList();

    public CompositeDirectory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        int size = 0;
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            CompositeEntry entry = (CompositeEntry) it.next();
            size += entry.getSize();
        }
        return size;
    }

    public CompositeEntry add(CompositeEntry entry) {
        directory.add(entry);
        return this;
    }

    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            CompositeEntry entry = (CompositeEntry) it.next();
            entry.printList(prefix + "/" + name);
        }
    }
}
