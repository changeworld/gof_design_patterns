public class DecoratorMain {
    public static void main(String[] args) {
        DecoratorDisplay d1 = new DecoratorStringDisplay("Hello, world.");
        DecoratorDisplay d2 = new SideBorder(d1, '#');
        DecoratorDisplay d3 = new FullBorder(d2);
        d1.show();
        d2.show();
        d3.show();
        DecoratorDisplay d4 = new SideBorder(
                new FullBorder(
                        new FullBorder(
                                new SideBorder(
                                        new FullBorder(
                                                new DecoratorStringDisplay("Hello!!")
                                        ),
                                        '*'
                                )
                        )
                ),
                '/'
        );
        d4.show();
    }
}
