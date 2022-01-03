package animals;


import model.Size;

import static model.Size.MEDIUM;

public class Fish extends Carnivorous implements Swim {

    private int satiety;

    public Fish(String name) {
        super(name);
    }

    public Fish() {
        super();
    }

    @Override
    public int getSatiety() {
        return satiety;
    }

    @Override
    public void swim() {
        System.out.println("Акула плавает");
    }

    @Override
    public Size getSize() {
        return MEDIUM;
    }
}