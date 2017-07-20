public class RepeatCommandNode extends Node {
    private int number;
    private Node commandListNode;

    public void parse(InterpreterContext context) throws InterpreterParseException {
        context.skipToken("repeat");
        number = context.currentNumber();
        context.nextToken();
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    public String toString() {
        return "[repeat " + number + " " + commandListNode + "]";
    }
}