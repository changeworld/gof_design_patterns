import java.util.ArrayList;
import java.util.HashMap;

public class IDCardFactory extends Factory {
  private HashMap hash = new HashMap();
  private int serial = 1;
  protected Product createProduct(String owner) {
    return new IDCard(owner, serial++);
  }
  protected void registerProduct(Product product) {
    IDCard card = (IDCard)product;
    hash.put(card.getSerial(), card.getOwner());
  }
  public HashMap getHash() {
    return hash;
  }
}
