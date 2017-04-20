package Offline.Offline5;

/**
 * Created by Lina.Burkalo on 23.02.2017.
 */
public class UseConvertation {
    public static void main(String[] args) {

        ConvertationGrnToDol res = new ConvertationGrnToDol(27.10);

        System.out.println("Result of convertation from GRN to USD: " + res.convert(3000));
        System.out.println("Result of convertation from GRN to USD: " + res.convert(10000));
        System.out.println("Result of convertation from GRN to USD: " + res.convert(100000));
    }
}
