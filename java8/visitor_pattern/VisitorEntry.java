import java.util.Iterator;

public abstract class VisitorEntry implements Element {
    public abstract String getName();

    public abstract int getSize();

    public VisitorEntry add(VisitorEntry entry) throws VisitorFileTreatmentException {
        throw new VisitorFileTreatmentException();
    }

    public Iterator iterator() throws VisitorFileTreatmentException {
        throw new VisitorFileTreatmentException();
    }

    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
