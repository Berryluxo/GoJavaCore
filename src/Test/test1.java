package Test;

/**
 * Created by Lina.Avramenko on 29.01.2017.
 */
public class test1 {
    public static void main(String[] args) {
        double n = 5.5;
        double a = (n * 10) % 10;
        int b;
        if (a >= 5) {
            b = (int) n + 1;
            System.out.println(b);
        }
        else {
            int c = (int) n;
            System.out.println(c);
        }
    }
}
