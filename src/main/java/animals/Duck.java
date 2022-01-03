package animals;

import model.Size;

import static model.Size.SMALL;

public class Duck extends Herbivore implements Fly, Swim, Voice, Run {

    public Duck(String name) {
        super(name);
    }

    public Duck() {
    }

    @Override
    public void fly() {
        System.out.println("Утка летает");
    }

    @Override
    public void swim() {
        System.out.println("Утка плавает");
    }

    @Override
    public String getVoice() {
        return "Кря-Кря";
    }

    @Override
    public void run() {
        System.out.println("Утка бегает");
    }

    @Override
    public Size getSize() {
        return SMALL;
    }
}