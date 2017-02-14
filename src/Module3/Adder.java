package Module3;

/**
 * Created by Lina.Burkalo on 13.02.2017.
 */
public class Adder  extends Arithmetic {
    public static void main(String[] args) {
        System.out.println(check(4, 5));
    }

    public static boolean check(Integer а, Integer b) {
        if (а >= b) {
            return true;
        }
        else {
            return false;
        }
    }

}
