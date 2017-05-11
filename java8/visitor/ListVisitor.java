import java.util.Iterator;

public class ListVisitor extends Visitor {
    private String currentdir = "";

    public void visit(VisitorFile file) {
        System.out.println(currentdir + "/" + file);
    }

    public void visit(VisitorDirectory directory) {
        System.out.println(currentdir + "/" + directory);
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            VisitorEntry entry = (VisitorEntry) it.next();
            entry.accept(this);
        }
        currentdir = savedir;
    }
}
