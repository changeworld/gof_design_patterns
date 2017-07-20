public class ProgramNode extends Node {
    private Node commandListNode;

    public void parse(InterpreterContext context) throws InterpreterParseException {
        context.skipToken("program");
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    public String toString() {
        return "[program " + commandListNode + "]";
    }
}