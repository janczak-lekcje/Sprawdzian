import zoo.Animals;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static class Trainer {


        public static void main(String[] args) {
            Animals animal = new Animals();
            animal.specie = "dog";
            animal.speak();
        }
    }
}