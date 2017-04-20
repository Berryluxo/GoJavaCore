package Module6;

/**
 * Created by Lina Burkalo on 05.04.2017.
 */
public class CitizenMain {
    public static void main(String[] args) {

        Citizen englishman = CitizenFactory.englishman();
        Citizen chinese = CitizenFactory.chinese();
        Citizen italian = CitizenFactory.italian();
        Citizen russian = CitizenFactory.russian();

        englishman.sayHello();
        chinese.sayHello();
        italian.sayHello();
        russian.sayHello();
    }
}
