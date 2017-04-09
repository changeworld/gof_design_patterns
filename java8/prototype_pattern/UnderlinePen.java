public class UnderlinePen implements PrototypeProduct {
    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("¥" + s + "¥");
        System.out.print(" ");
        for (int i = 0; i < length; i++) {
            System.out.print(ulchar);
        }
        System.out.println("");
    }

    public PrototypeProduct createClone() {
        PrototypeProduct p = null;
        try {
            p = (PrototypeProduct) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}