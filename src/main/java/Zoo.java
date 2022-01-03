import animals.*;
import employee.Worker;
import food.Grass;
import food.Meat;
import model.Aviary;
import model.Size;

public class Zoo {

    public static Swim[] createPond() {
        Swim[] swimmer = new Swim[2];
        swimmer[0] = new Duck();
        swimmer[1] = new Fish();
        return swimmer;
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        Elephant elephant = new Elephant();
        Fish fish = new Fish();
        Kotik kotik = new Kotik();
        Rabbit rabbit = new Rabbit();
        Wolf wolf = new Wolf();
        Grass grass = new Grass();
        Meat meat = new Meat();
        Worker worker = new Worker();


        Swim[] swimmer = createPond();
        for (Swim swim : swimmer) {
            swim.swim();
        }
    }

    private static Aviary<Carnivorous> carnivorousAviary = new Aviary<>(Size.MEDIUM);
    private static Aviary<Herbivore> herbivoreAviary = new Aviary<>(Size.SMALL);


    private static Herbivore[] fillCarnivorousAviary() {
        Carnivorous[] carnivorous = new Carnivorous[3];
        return carnivorousAviary.addAnimal();
    }

    private static Herbivore[] fillHerbivoreAviary() {
        Herbivore[] herbivores = new Herbivore[3];
        return herbivoreAviary.addAnimal();
    }

    public static Animal getCarnivorous(String name) {
        return carnivorousAviary.getAnimal(name);

    }

    public static Animal getHerbivore(String name) {
        return herbivoreAviary.getAnimal(name);
    }
}
