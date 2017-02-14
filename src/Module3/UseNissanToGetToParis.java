package Module3;

import java.util.Arrays;

/**
 * Created by Lina.Avramenko on 09.02.2017.
 */
public class UseNissanToGetToParis {
    public static void main(String[] args) {

        NissanJukeCar myCar = null; //Declaration
        myCar = new NissanJukeCar("red"); //Initialization

        System.out.println("Doors: " + myCar.doorsAmount);

        System.out.println(myCar.doorsAmount);

        NissanJukeCar familyCar = new NissanJukeCar("yellow");

        //myCar.color = "red";

        System.out.println("Color: " + myCar.color);

        //Wheal[] wheels = myCar.wheels;


        for (int i = 0; i < myCar.wheels.length; i++) {
            myCar.wheels[i] = new Wheal(i);
        }

        System.out.println(Arrays.toString(myCar.wheels));

        boolean areWeInParis = myCar.goToDestination("Paris");


        System.out.println("Are we in Paris? " + (areWeInParis? "Yes!": "No!"));

        myCar.goToDestination("Paris", 1000);
    }
}
