public interface Context {
    public abstract void setClock(int hour);

    public abstract void changeState(State state);

    public abstract void callSecurityCenter(String msg);

    public abstract void recordLog(String msg);

    public abstract Boolean isDay(int hour);

    public abstract Boolean isNight(int hour);
}