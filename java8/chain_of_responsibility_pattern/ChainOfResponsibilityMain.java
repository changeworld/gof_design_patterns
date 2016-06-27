public class ChainOfResponsibilityMain {
  public static void main(String[] args) {
    Support aida    = new NoSupport("Aida");
    Support baba    = new LimitSupport("Baba", 100);
    Support chiyoda = new SpecialSupport("Chiyoda", 429);
    Support doi     = new LimitSupport("Doi", 200);
    Support eda     = new OddSupport("Eda");
    Support fujiko  = new LimitSupport("Fujiko", 300);
    aida.setNext(baba).setNext(chiyoda).setNext(doi).setNext(eda).setNext(fujiko);
    for (int i = 0; i < 500; i += 33) {
      aida.support(new Trouble(i));
    }
  }
}
