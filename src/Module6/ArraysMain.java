package Module6;

import java.util.Arrays;


/**
 * Created by Lina.Burkalo on 05.04.2017.
 */
public class ArraysMain {
    public static void main(String[] args) {
        int[] array = {32, -4, 17, -6, 129, -49, 10, 38, 548, 54};

        System.out.println("Sum of integer array: " + ArraysUtils.sum(array));
        System.out.println("Min of integer array: " + ArraysUtils.min(array));
        System.out.println("Max of integer array: " + ArraysUtils.max(array));
        System.out.println("maxPositive of integer array: " + ArraysUtils.maxPositive(array));
        System.out.println("multiplication of integer array: " + ArraysUtils.multiplication(array));
        System.out.println("Modulus of integer array: " + ArraysUtils.modulus(array));
        System.out.println("secondLargest of integer array: " + ArraysUtils.secondLargest(array));
        System.out.println("reverse of integer array: " + Arrays.toString(ArraysUtils.reverse(array)));
        System.out.println("findEvenElements of integer array: " + Arrays.toString(ArraysUtils.findEvenElements(array)));

    }
}
