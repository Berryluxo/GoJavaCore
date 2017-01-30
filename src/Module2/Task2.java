package Module2;

/**
 * Created by Lina.Avramenko on 30.01.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        int balance, withdrawal;
        result(200, 199);
    }

    static void result(int balance, int withdrawal) {
        int commision = 5;
        double comTrans = (double) withdrawal * (double) commision / 100;
        double result = balance - withdrawal - comTrans;
        if (result >= 0)
            System.out.println("OK " + comTrans + " " + result);
        else
            System.out.println("NO");

    }
}
