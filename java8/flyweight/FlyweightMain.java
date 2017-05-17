public class FlyweightMain {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java FlyweightMain digits");
            System.out.println("Example: java FlyweightMain 1212123");
            System.exit(0);
        }
        BigString bs = new BigString(args[0]);
        bs.print();
    }
}