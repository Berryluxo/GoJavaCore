package Module2;

/**
 * Created by Lina.Avramenko on 29.01.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        int [] array = {32, 4, 17, 6, 129, 49, 10, 38, 9, 88};
        int sumArrays = sum(array);
        System.out.println(sumArrays);
    }

    static int sum(int array[]) {
        int sumArray = 0;
        for (int sArray : array)
            sumArray += sArray;
        return sumArray;

    }


}
