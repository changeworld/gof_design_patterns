import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Gamer {
    private static String[] fruitsName = {
            "Apple", "Grape", "Banana", "Orange",
    };
    private int money;
    private List fruits = new ArrayList();
    private Random random = new Random();

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("Money has increased");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("Money has halved");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("You got fruit(" + f + ")");
            fruits.add(f);
        } else {
            System.out.println("Nothing happened");
        }
    }

    public Memento createMemento() {
        Memento m = new Memento(money);
        Iterator it = fruits.iterator();
        while (it.hasNext()) {
            String f = (String) it.next();
            if (f.startsWith("Yummy")) {
                m.addFruit(f);
            }
        }
        return m;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    public String toString() {
        return "[money = " + money + ", fruit = " + fruits + "]";
    }

    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "Yummy";
        }
        return prefix + fruitsName[random.nextInt(fruitsName.length)];
    }
}