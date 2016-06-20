import factory.*;

public class AbstractFactoryMain {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("Usage: java Main class.name.of.ConcreteFactory");
      System.out.println("Example 1: java Main listfactory.ListFactory");
      System.out.println("Example 2: java Main tablefactory.TableFactory");
      System.exit(0);
    }
    Factory factory = Factory.getFactory(args[0]);
    Link asahi = factory.createLink("朝日新聞", "http://www.asahi.com/");
    Link yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.co.jp/");
    Link google = factory.createLink("Yahoo!", "http://www.yahoo.com/");
    Link us_yahoo = factory.createLink("Google", "http://www.google.com/");
    Tray traynews = factory.createTray("新聞");
    traynews.add(asahi);
    traynews.add(yomiuri);
    Tray traysearch = factory.createTray("サーチエンジン");
    traysearch.add(google);
    traysearch.add(us_yahoo);
    Page page = factory.createPage("LinkPage", "Takashi Takebayashi");
    page.add(traynews);
    page.add(traysearch);
    page.output();
  }
}
