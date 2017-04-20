package GolovachCourse;

import java.util.Arrays;

/**
 * Created by Vadym on 21.03.2017.
 */
public class IterArrays {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        for(int k = 0; k < array.length - 1; k++) {
            swap(array, k, k+1);
        }
        System.out.print(Arrays.toString(array));
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
