public class NightState implements State {
    private static NightState singleton = new NightState();

    private NightState() {
    }

    public static State getInstance() {
        return singleton;
    }

    public void doClock(Context context, int hour) {
        if (9 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    public void doUse(Context context) {
        context.recordLog("Emergency!! Use of safe(night time)");
    }

    public void doAlarm(Context context) {
        context.callSecurityCenter("Emergency call(night time)");
    }

    public void doPhone(Context context) {
        context.callSecurityCenter("Normal call & record(night time)");
    }

    public String toString() {
        return "[night time]";
    }
}
