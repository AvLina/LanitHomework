package animals;

import model.Size;

public class Rabbit extends Herbivore implements Run {

    private int satiety;

    public Rabbit(String name) {
        super(name);
    }

    @Override
    public Size getSize() {
        return null;
    }

    public Rabbit() {
        super();
    }

    @Override
    public int getSatiety() {
        return satiety;
    }

    @Override
    public void run() {
        System.out.println("Кролик бегает");
    }
}
