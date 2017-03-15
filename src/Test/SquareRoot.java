package Test;

/**
 * Created by Lina.Burkalo on 28.02.2017.
 */
public class SquareRoot {

    public static void main(String[] args) {
        double a = 3;
        double b = 2.5;
        double c = -0.5;
        double x1;
        double x2;

        if (a == 0 && b == 0) {
            System.out.println("х1=");
            System.out.println("х1=");
        }

        else if (a == 0 && b == 0 && c == 0) {
            System.out.println("х1=");
            System.out.println("х1=");
        }

        else if (a == 0 && c == 0) {
            x1 = 0.0;
            x2 = 0.0;
            System.out.println("х1=" + x1);
            System.out.println("х1=" + x2);
        }
        else {
        double D = (b*b) - 4*a*c;
        x1 = ((-b) + Math.sqrt(D)) / (2*a);//PUT YOUR CODE HERE
        x2 = ((-b) - Math.sqrt(D)) / (2*a);
        System.out.println("х1=" + x1);
        System.out.println("х1=" + x2);}
        //PUT YOUR CODE HERE
    }
}
