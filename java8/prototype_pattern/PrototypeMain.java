public class PrototypeMain {
  public static void main(String[] args) {
    Manager manager = new Manager();
    UnderlinePen underlinePen = new UnderlinePen('~');
    MessageBox mbox = new MessageBox('*');
    MessageBox nbox = new MessageBox('/');
    manager.register("strong message", underlinePen);
    manager.register("warning box", mbox);
    manager.register("slash message", nbox);
    Product p1 = manager.create("strong message");
    p1.use("Hello, world.");
    Product p2 = manager.create("warning box");
    p2.use("Hello, world.");
    Product p3 = manager.create("slash message");
    p3.use("Hello, world.");
  }
}
