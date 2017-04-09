package listfactory;

import factory.AbstractFactory;
import factory.Link;
import factory.Page;
import factory.Tray;

public class ListFactory extends AbstractFactory {
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
