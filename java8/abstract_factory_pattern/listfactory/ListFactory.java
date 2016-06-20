package listfactory;
import factory.Factory;
import factory.Link;
import factory.Tray;
import factory.Page;

public class ListFactory extends Factory {
  public Link createLink(String caption, String url) {
    return new ListLink(caption, url);
  }
  public Tray createTray(String caption) {
    return new ListTray(caption);
  }
  public Page createPage(String title, String author) {
    return new ListPage(title, author);
  }
}
