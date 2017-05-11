import java.util.Random;

public class FoolishStrategy implements Strategy {
    private Random random;
    private Boolean won = false;
    private Hand lastHand;

    public FoolishStrategy(int seed) {
        random = new Random(seed);
    }

    public Hand nextHand() {
        if (!won) {
            lastHand = Hand.getHand(random.nextInt(3));
        }
        return lastHand;
    }

    public void study(boolean win) {
        won = win;
    }
}
