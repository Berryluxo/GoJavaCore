package Module6;

import java.util.Arrays;

/**
 * Created by Lina.Burkalo on 31.03.2017.
 */
public final class ArraysUtils {

    private ArraysUtils() {
        throw new AssertionError();
    }

    public static int sum(int array[]) {
        int sumArray = 0;
        for (int sArray : array) {
            sumArray += sArray;
        }
        return sumArray;
    }

    static int min(int array[]) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    static int max(int array[]) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        return max;
    }

    static int maxPositive(int array[]) {
        int maxPositive = 0;
        for (int anArray : array) {
            if (anArray > 0 && maxPositive < anArray)
                maxPositive = anArray;
        }
        return maxPositive;
    }

    static int multiplication(int array[]) {
        int multiplication = 1;
        for (int i = 0; i < array.length; i++) {
            multiplication = multiplication * array[i];
        }
        return multiplication;
    }

    static int modulus(int array[]) {
        int modulus = array[0] % array[array.length - 1];
        return modulus;
    }

    static int secondLargest(int array[]) {
        int largest = 0;
        int previousLarger = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                previousLarger = largest;
                largest = array[i];
            }
        }
        return previousLarger;
    }

    static int[] reverse(int[] array){

        int[] reversedArray = new int[array.length];
        for (int i = array.length-1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = array[i];
        }
        return reversedArray;

    }


    static int[] findEvenElements(int[] array){

        int[] temp = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                temp[count] = array[i];
                count++;
            }
        }
        int[] even = new int[count];
        System.arraycopy(temp, 0, even, 0, count);
        return even;
    }
}
