package assigement11.Exercise2;
import java.util.Date;

public class Dog extends Animal {
    String breed;

    public Dog(String id, String source, Date dateOfBirth, String color) {
        super(id, source, dateOfBirth, color);
        this.breed = breed;
    }

    public void makeSound() {
        System.out.println("Gau Gau");
    }
}
