public class NoonState implements State {
    private static NoonState singleton = new NoonState();

    private NoonState() {
    }

    public static State getInstance() {
        return singleton;
    }

    public void doClock(Context context, int hour) {
        if (context.isDay(hour)) {
            context.changeState(DayState.getInstance());
        } else if (context.isNight(hour)) {
            context.changeState(NightState.getInstance());
        }
    }

    public void doUse(Context context) {
        context.recordLog("Emergency!! Use of safe(noon)");
    }

    public void doAlarm(Context context) {
        context.callSecurityCenter("Emergency call(noon)");
    }

    public void doPhone(Context context) {
        context.callSecurityCenter("Normal call & record(noon)");
    }

    public String toString() {
        return "[noon]";
    }
}