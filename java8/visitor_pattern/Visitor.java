public abstract class Visitor {
    public abstract void visit(VisitorFile file);

    public abstract void visit(VisitorDirectory directory);
}
