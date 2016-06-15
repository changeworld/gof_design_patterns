public class FactoryMethodMain {
  public static void main(String[] args) {
    Factory factory = new IDCardFactory();
    Product card1 = factory.create("アイダアユム");
    Product card2 = factory.create("ババブンタ");
    Product card3 = factory.create("チバチアキ");
    card1.use();
    card2.use();
    card3.use();
  }
}
