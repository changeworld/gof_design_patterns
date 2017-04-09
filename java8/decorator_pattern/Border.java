public abstract class Border extends DecoratorDisplay {
    protected DecoratorDisplay display;

    protected Border(DecoratorDisplay display) {
        this.display = display;
    }
}
