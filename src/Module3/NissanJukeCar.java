package Module3;

/**
 * Created by Lina.Avramenko on 09.02.2017.
 */
public class NissanJukeCar {

    Wheal[] wheels = new Wheal[4];
    double engineValue = 1.6;
    int doorsAmount = 5;
    String color;
    double patrolLostBy100Km = 20;
    String name = "Sport";

    //public  NissanJukeCar() {

    //}

    public boolean goToDestination(String cityName) {

        for (Wheal wheal : wheels) {
            if (wheal == null) {
                return false;
            }
        }

        System.out.println("UHU! We are in " + cityName);
        return true;
    }

    public boolean goToDestination(String cityName, int distance) {

        for (Wheal wheal : wheels) {
            if (wheal == null) {
                return false;
            }
        }

        double lostPatrol = distance / 100 * patrolLostBy100Km;

        System.out.println("UHU! We are in " + cityName + "but lost " + lostPatrol);
        return true;
    }

    public NissanJukeCar(String color) {
        this.color = color;
    }

    public NissanJukeCar() {

    }

    public NissanJukeCar(int doorsAmount) {
        this.doorsAmount = doorsAmount;
    }
}
