public class FactoryMethodMain {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        FactoryProduct card1 = factory.create("アイダアユム");
        FactoryProduct card2 = factory.create("ババブンタ");
        FactoryProduct card3 = factory.create("チバチアキ");
        card1.use();
        card2.use();
        card3.use();
    }
}
