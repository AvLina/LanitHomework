package animals;

import model.Size;

public class Wolf extends Carnivorous implements Run, Voice {

    public Wolf() {
    }

    @Override
    public void run() {
        System.out.println("Волк быстро бегает");
    }

    @Override
    public String getVoice() {
        return "Ау-у-у-у";
    }

    @Override
    public Size getSize() {
        return null;
    }

    public Wolf(String name) {
        super(name);
    }
}
