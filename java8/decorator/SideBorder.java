public class SideBorder extends Border {
    private char borderChar;

    public SideBorder(DecoratorDisplay display, char ch) {
        super(display);
        this.borderChar = ch;
    }

    public int getColums() {
        return 1 + display.getColums() + 1;
    }

    public int getRows() {
        return display.getRows();
    }

    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }
}
