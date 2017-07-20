import java.util.StringTokenizer;

public class InterpreterContext {
    private StringTokenizer tokenizer;
    private String currentToken;

    public InterpreterContext(String text) {
        tokenizer = new StringTokenizer(text);
        nextToken();
    }

    public String nextToken() {
        if (tokenizer.hasMoreTokens()) {
            currentToken = tokenizer.nextToken();
        } else {
            currentToken = null;
        }
        return currentToken;
    }

    public String currentToken() {
        return currentToken;
    }

    public void skipToken(String token) throws InterpreterParseException {
        if (!token.equals(currentToken)) {
            throw new InterpreterParseException("Warning: " + token + " is expected, but " + currentToken + " is found.");
        }
        nextToken();
    }

    public int currentNumber() throws InterpreterParseException {
        int number = 0;
        try {
            number = Integer.parseInt(currentToken);
        } catch (NumberFormatException e) {
            throw new InterpreterParseException("Warning: " + e);
        }
        return number;
    }
}