
package assigement11.Exercise2;
import java.util.ArrayList;

public class AnimalList {
    ArrayList<Animal> animals;

    public AnimalList() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void displayAll() {
        for (Animal animal : animals) {
            System.out.println("ID: " + animal.id);
            System.out.println("Source: " + animal.source);
            System.out.println("Date of Birth: " + animal.dateOfBirth);
            System.out.println("Color: " + animal.color);
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                System.out.println("Breed: " + dog.breed);
                dog.makeSound();
            } else if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                cat.makeSound();
            }
            System.out.println("-------------------");
        }
    }
}
