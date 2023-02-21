package Animals;

public class AnimalTester {

        public static void displayAnimalDetails(Animal animal){
            System.out.println(animal.toString());
        }

    public static void main(String[] args) {
//            Dog charlie = new Dog(4,"bed","chi");
//        System.out.println(charlie.getAnimalInfo());
//
//        Animal bird = new Animal(2,"tree");
//        System.out.println(bird.getAnimalInfo());

        Fish gorg = new Fish(2,"golf of mexico",54.12);
        System.out.println(gorg.getAnimalInfo());
    }
}
