package assigement11.Exercise2;
import java.util.Date;
public class Processor {
    public static void main(String[] args) {
        AnimalList animalList = new AnimalList();

        Dog dog1 = new Dog("D01", "lu", new Date(), "Black");
        Cat cat1 = new Cat("C01", "Si", new Date(), "Gray");
        Dog dog2 = new Dog("D02", "Ka", new Date(), "Brown");

        animalList.addAnimal(dog1);
        animalList.addAnimal(cat1);
        animalList.addAnimal(dog2);

        animalList.displayAll();
    }
}
