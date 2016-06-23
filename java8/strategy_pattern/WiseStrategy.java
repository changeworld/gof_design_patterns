import java.util.Random;

public class WiseStrategy implements Strategy {
  private Random random;
  private int lastValueHand = 0;
  private int nowValueHand = 0;
  private int[][] history = {
    {1, 1, 1, },
    {1, 1, 1, },
    {1, 1, 1, }
  };
  public WiseStrategy(int seed) {
    random = new Random(seed);
  }
  public Hand nextHand() {
    int bet = random.nextInt(getSum(nowValueHand));
    int valueHand = 0;
    if (bet < history[nowValueHand][0]) {
      valueHand = 0;
    } else if (bet < history[nowValueHand][0] + history[nowValueHand][1]) {
      valueHand = 1;
    } else {
      valueHand = 2;
    }
    lastValueHand = nowValueHand;
    nowValueHand = valueHand;
    return Hand.getHand(valueHand);
  }
  public void study(boolean win) {
    if (win) {
      history[lastValueHand][nowValueHand]++;
    } else {
      history[lastValueHand][(nowValueHand + 1) % 3]++;
      history[lastValueHand][(nowValueHand + 2) % 3]++;
    }
  }
  public int getSum(int value) {
    int sum = 0;
    for (int i = 0; i < 3; i++) {
      sum += history[value][i];
    }
    return sum;
  }
}
