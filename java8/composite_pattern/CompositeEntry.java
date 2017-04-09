public abstract class CompositeEntry {
    public abstract String getName();

    public abstract int getSize();

    public CompositeEntry add(CompositeEntry entry) throws CompositeFileTreatmentException {
        throw new CompositeFileTreatmentException();
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
