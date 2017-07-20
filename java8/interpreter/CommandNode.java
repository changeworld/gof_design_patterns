public class CommandNode extends Node {
    private Node node;

    public void parse(InterpreterContext context) throws InterpreterParseException {
        if (context.currentToken().equals("repeat")) {
            node = new RepeatCommandNode();
        } else {
            node = new PrimitiveCommandNode();
        }
        node.parse(context);
    }

    public String toString() {
        return node.toString();
    }
}