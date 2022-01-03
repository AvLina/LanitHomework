package animals;

import model.Size;

public class Elephant extends Herbivore implements Run, Voice {

    public Elephant() {
    }

    @Override
    public void run() {
        System.out.println("Слон бегает");
    }

    @Override
    public String getVoice() {
        return "Слон трубит";
    }

    @Override
    public Size getSize() {
        return null;
    }

    public Elephant(String name) {
        super(name);
    }
}
