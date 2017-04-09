public class TemplateMethodMain {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new TemplateStringDisplay("Hello, world.");
        d1.display();
        d2.display();
    }
}