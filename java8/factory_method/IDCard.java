public class IDCard extends FactoryProduct {
    private String owner;
    private int serial;

    IDCard(String owner, int serial) {
        System.out.println(owner + " serial number[" + serial + "]のカードを作ります。");
        this.owner = owner;
        this.serial = serial;
    }

    public void use() {
        System.out.println(owner + " serial number[" + serial + "]のカードを使います。");
    }

    public String getOwner() {
        return owner;
    }

    public int getSerial() {
        return serial;
    }
}
