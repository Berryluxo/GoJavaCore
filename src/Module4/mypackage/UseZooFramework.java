package Module4.mypackage;

import Module4.Animal;
import Module4.Zoo;

/**
 * Created by Lina.Burkalo on 16.02.2017.
 */
public class UseZooFramework {
    public static void main(String[] args) {
        Animal[] myAnimals = new Animal[1];
        myAnimals[0] = new Snake();

        Zoo zoo = new Zoo();

        Zoo.feedAllAnimals(myAnimals);
    }
}
