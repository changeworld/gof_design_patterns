import java.util.ArrayList;

public class IDCardFactory extends Factory {
  private ArrayList owners = new ArrayList();
  protected Product createProduct(String owner) {
    return new IDCard(owner);
  }
  protected void registerProduct(Product product) {
    owners.add(((IDCard)product).getOwner());
  }
}
