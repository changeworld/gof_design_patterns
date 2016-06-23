public class Player {
  private String name;
  private Strategy strategy;
  private int countWin;
  private int countLose;
  private int countGame;
  public Player(String name, Strategy strategy) {
    this.name = name;
    this.strategy = strategy;
  }
  public Hand nextHand() {
    return strategy.nextHand();
  }
  public void win() {
    strategy.study(true);
    countWin++;
    countGame++;
  }
  public void lose() {
    strategy.study(false);
    countLose++;
    countGame++;
  }
  public void even() {
    countGame++;
  }
  public String toString() {
    return "[" + name + ":" + countGame + " games, "
      + countWin + " win, "
      + countLose + " lose" + "]";
  }
}
