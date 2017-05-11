public class Hand {
    public static final int VALUE_GUU = 0;
    public static final int VALUE_CHOKI = 1;
    public static final int VALUE_PAA = 2;
    public static final String NAME_GUU = "グー";
    public static final String NAME_CHOKI = "チョキ";
    public static final String NAME_PAA = "パー";
    public static final Hand[] hand = {
            new Hand(VALUE_GUU),
            new Hand(VALUE_CHOKI),
            new Hand(VALUE_PAA)
    };
    private static final String[] name = {
            NAME_GUU, NAME_CHOKI, NAME_PAA
    };
    private int valueHand;

    private Hand(int valueHand) {
        this.valueHand = valueHand;
    }

    public static Hand getHand(int valueHand) {
        return hand[valueHand];
    }

    public String toString() {
        return name[valueHand];
    }

    public boolean isStrongerThan(Hand hand) {
        return fight(hand) == 1;
    }

    public boolean isWeakerThan(Hand hand) {
        return fight(hand) == -1;
    }

    public int fight(Hand hand) {
        if (this == hand) {
            return 0;
        } else if ((this.valueHand + 1) % 3 == hand.valueHand) {
            return 1;
        } else {
            return -1;
        }
    }
}
