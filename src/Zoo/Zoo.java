package Zoo;

import Zoo.Birds.Bird;
import Zoo.Birds.Owl;
import Zoo.Birds.Parrot;
import Zoo.Mammal.Elephant;
import Zoo.Mammal.Human;
import Zoo.Mammal.Monkey;

import java.util.Arrays;

/**
 * Created by Lina.Burkalo on 16.02.2017.
 */
public class Zoo {

    public static void main(String[] args) {
        Animals[] animalsArray = new Animals[2];

        animalsArray[0] = new Monkey();
        animalsArray[1] = new Elephant();

        Owl owlGalya = new Owl();
        animalsArray = addElementToArray(animalsArray, owlGalya);

        Parrot parrotPetya = new Parrot();
        animalsArray = addElementToArray(animalsArray, new Parrot());
        animalsArray = addElementToArray(animalsArray, new Parrot());

        animalsArray = addElementToArray(animalsArray, new Human());

        feedAllAnimals(animalsArray);

    }

    private static Animals[] addElementToArray(Animals[] animalsArray, Animals newZooMember) {
        Animals[] newAnimals = Arrays.copyOf(animalsArray, animalsArray.length+1);
        newAnimals[newAnimals.length-1] = newZooMember;
        return newAnimals;
    }

    public static void feedAllAnimals(Animals[] animalsArray) {
        for (Animals animal : animalsArray) {
            animal.feed();
        }
    }
}
