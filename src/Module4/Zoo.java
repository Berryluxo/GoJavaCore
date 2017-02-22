package Module4;

/**
 * Created by Lina.Burkalo on 16.02.2017.
 */
public class Zoo {

    public static void main(String[] args) {

        Animal[] animalsArray = new Animal[2];

        animalsArray[0] = new Monkey();
        animalsArray[1] = new Elephant();

        feedAllAnimals(animalsArray);
    }

    public static void feedAllAnimals(Animal[] animalsArray) {
        for (Animal animal : animalsArray) {
            animal.feed();
        }
    }
}
