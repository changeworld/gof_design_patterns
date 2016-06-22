public class BrideMain {
  public static void main(String[] args) {
    Display d1 = new Display(new StringDisplayImpl("Hello, Japan."));
    Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
    CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
    RandomCountDisplay d4 = new RandomCountDisplay(new StringDisplayImpl("Hello, Galaxy."));
    int times = 5;
    d1.display();
    d2.display();
    d3.display();
    d3.multiDisplay(times);
    d4.randomDisplay(times);
  }
}
