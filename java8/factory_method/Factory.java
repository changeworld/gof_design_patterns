public abstract class Factory {
    public final FactoryProduct create(String owner) {
        FactoryProduct p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract FactoryProduct createProduct(String owner);

    protected abstract void registerProduct(FactoryProduct product);
}