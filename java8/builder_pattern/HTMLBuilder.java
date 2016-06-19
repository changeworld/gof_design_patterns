import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder {
  private String finename;
  private PrintWriter writer;
  public void makeTitle(String title) {
    finename = title + ".html";
    try {
      writer = new PrintWriter(new FileWriter(finename));
    } catch (IOException e) {
      e.printStackTrace();
    }
    writer.println("<html><head><title>" + title + "</title></head><body>");
    writer.println("<h1>" + title + "</h1>");
  }
  public void makeString(String s) {
    writer.println("<p>" + s + "</p>");
  }
  public void makeItems(String[] items) {
    writer.println("<ul>");
    for (int i = 0; i < items.length; i++) {
      writer.println("<li>" + items[i] + "</li>");
    }
    writer.println("</ul>");
  }
  public void close() {
    writer.println("</body></html>");
    writer.close();
  }
  public String getResult() {
    return finename;
  }
}
