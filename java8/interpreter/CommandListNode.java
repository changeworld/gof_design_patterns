import java.util.ArrayList;

public class CommandListNode extends Node {
    private ArrayList list = new ArrayList();

    public void parse(InterpreterContext context) throws InterpreterParseException {
        while (true) {
            if (context.currentToken() == null) {
                throw new InterpreterParseException("Missing 'end'");
            } else if (context.currentToken().equals("end")) {
                context.skipToken("end");
            } else {
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }

    public String toString() {
        return list.toString();
    }
}