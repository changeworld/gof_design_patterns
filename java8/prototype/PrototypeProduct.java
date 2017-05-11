public interface PrototypeProduct extends Cloneable {
    public abstract void use(String s);

    public abstract PrototypeProduct createClone();
}