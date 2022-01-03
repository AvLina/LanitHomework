import animals.Kotik;

public class Application {

    private static boolean compareVoice(Kotik kotik1, Kotik kotik2) {
        String voice1 = kotik1.getVoice();
        String voice2 = kotik2.getVoice();
        if (voice1.equals(voice2))
            return true;
        else return false;
    }

    public static void main(String[] args) {

        Kotik kotik1 = new Kotik("Tom", "Meow", 5, 7);
        Kotik kotik2 = new Kotik();
        kotik2.setName("Jerry");
        kotik2.setVoice("Meow-Meow");
        kotik2.setSatiety(7);
        kotik2.setWeight(10);

        for(String s: kotik2.liveAnotherDay()) {
            System.out.println(s);
        }

        System.out.println(kotik1.getName() + " " + kotik1.getWeight());
        System.out.println("Голоса одинаковые: " + compareVoice(kotik1,kotik2));
        System.out.println("Количество созданных котиков " + Kotik.getCount());

    }
}