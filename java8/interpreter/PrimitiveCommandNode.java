public class PrimitiveCommandNode extends Node {
    private String name;

    public void parse(InterpreterContext context) throws InterpreterParseException {
        name = context.currentToken();
        context.skipToken(name);
        if (!name.equals("go") && !name.equals("right") && !name.equals("left")) {
            throw new InterpreterParseException(name + " is undefined");
        }
    }

    public String toString() {
        return name;
    }
}