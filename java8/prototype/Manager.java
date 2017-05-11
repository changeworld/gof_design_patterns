import java.util.HashMap;

public class Manager {
    private HashMap showcase = new HashMap();

    public void register(String name, PrototypeProduct product) {
        showcase.put(name, product);
    }

    public PrototypeProduct create(String protoname) {
        PrototypeProduct p = (PrototypeProduct) showcase.get(protoname);
        return p.createClone();
    }
}