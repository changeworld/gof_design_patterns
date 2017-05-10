public class MementoMain {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("==== Round " + (i + 1));
            System.out.println("Now:" + gamer);
            gamer.bet();
            System.out.println("Money is " + gamer.getMoney());
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("Let's save the current state");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("Let's undo the previous state");
                gamer.restoreMemento(memento);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            System.out.println("");
        }
    }
}