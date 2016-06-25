public class FullBorder  extends Border {
  public FullBorder(Display display) {
    super(display);
  }
  public int getColums() {
    return 1 + display.getColums() + 1;
  }
  public int getRows() {
    return 1 + display.getRows() + 1;
  }
  public String getRowText(int row) {
    if (row == 0) {
      return "+" + makeLine('-', display.getColums()) + "+";
    } else if (row == display.getRows() + 1) {
      return "+" + makeLine('-', display.getColums()) + "+";
    } else {
      return "|" + display.getRowText(row - 1) + "|";
    }
  }
  private String makeLine(char ch, int count) {
    StringBuffer buf = new StringBuffer();
    for (int i = 0; i < count; i++) {
      buf.append(ch);
    }
    return buf.toString();
  }
}
