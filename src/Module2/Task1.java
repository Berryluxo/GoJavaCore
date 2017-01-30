package Module2;

/**
 * Created by Lina.Avramenko on 29.01.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] array = {32, -4, 17, -6, -129, -49, 10, 38, 548, 54};
        double [] arrayDoub = {52.4, -45.7, 6.7, 155.1, 633.9, -4.6, 7.2, 1.4, -111.5, -0.8};
        sum(array);
        sum(arrayDoub);
        min(array);
        min(arrayDoub);
        max(array);
        max(arrayDoub);
        maxPositive(array);
        maxPositive(arrayDoub);
        multiplication(array);
        multiplication(arrayDoub);
        modulus(array);
        modulus(arrayDoub);
        secondLargest(array);
        secondLargest(arrayDoub);

    }

    // Calculate sum for int
    static void sum(int array[]) {
        int sumArray = 0;
        for (int sArray : array) {
            sumArray += sArray;
        }
        System.out.println("Sum: " + sumArray);
    }
    // Calculate sum for double
    static void sum(double arrayDoub[]) {
        double sumArray = 0;
        for (double sArray : arrayDoub) {
            sumArray += sArray;
        }
        System.out.println("Sum: " + sumArray);
    }

    // Calculate min for int
    static void min(int array[]) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
        }
        System.out.println("Min: " + min);
    }

    // Calculate min for double
    static void min(double arrayDoub[]) {
        double min = arrayDoub[0];
        for (int i = 0; i < arrayDoub.length; i++) {
            if (min > arrayDoub[i])
                min = arrayDoub[i];
        }
        System.out.println("Min: " + min);
    }

    // Calculate max for int
    static void max(int array[]) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        System.out.println("Max: " + max);
    }

    // Calculate max for double
    static void max(double arrayDoub[]) {
        double max = arrayDoub[0];
        for (int i = 0; i < arrayDoub.length; i++) {
            if (max < arrayDoub[i])
                max = arrayDoub[i];
        }
        System.out.println("Max: " + max);
    }

    // Calculate max positive for int
    static void maxPositive(int array[]) {
        int maxPositive = 0;
        for (int anArray : array) {
            if (anArray > 0 && maxPositive < anArray)
                maxPositive = anArray;
        }
        if (maxPositive > 0)
            System.out.println("Max positive: " + maxPositive);
        else
            System.out.println("There is no positive numbers");
    }

    // Calculate max positive for double
    static void maxPositive(double arrayDoub[]) {
        double maxPositive = 0;
        for (double anArray : arrayDoub) {
            if (anArray > 0 && maxPositive < anArray)
                maxPositive = anArray;
        }
        if (maxPositive > 0)
            System.out.println("Max positive: " + maxPositive);
        else
            System.out.println("There is no positive numbers");
    }

    // Calculate multiplication for int
    static void multiplication(int array[]) {
        int multiplication = 1;
        for (int i = 0; i < array.length; i++) {
            multiplication = multiplication * array[i];
        }
        System.out.println("Multiplication: " + multiplication);
    }

    // Calculate multiplication for double
    static void multiplication(double arrayDoub[]) {
        double multiplication = 1;
        for (int i = 0; i < arrayDoub.length; i++) {
            multiplication = multiplication * arrayDoub[i];
        }
        System.out.println("Multiplication: " + multiplication);
    }

    // Calculate modulus of first and last element for int
    static void modulus(int array[]) {
        int first = array[0];
        int last = array[array.length - 1];
        System.out.println("First modulus: " + Math.abs(first));
        System.out.println("Last modulus: " + Math.abs(last));
    }

    // Calculate modulus of first and last element for double
    static void modulus(double arrayDoub[]) {
        double first = arrayDoub[0];
        double last = arrayDoub[arrayDoub.length - 1];
        System.out.println("First modulus: " + Math.abs(first));
        System.out.println("Last modulus: " + Math.abs(last));
    }

    // Calculate second largest element for int
    static void secondLargest(int array[]) {
        // bubbleSort
        for(int i = array.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( array[j] < array[j+1] ){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        int secondLargest = array[0];
        for (int i = 1; i < array.length; i++)
            if (secondLargest != array[i]){
                secondLargest = array[i];
                break;}


        System.out.println("Second largest: " + secondLargest);
    }

    // Calculate second largest element for double
    static void secondLargest(double arrayDoub[]) {
        // bubbleSort
        for(int i = arrayDoub.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arrayDoub[j] < arrayDoub[j+1] ){
                    double tmp = arrayDoub[j];
                    arrayDoub[j] = arrayDoub[j+1];
                    arrayDoub[j+1] = tmp;
                }
            }
        }
        double secondLargest = arrayDoub[0];
        for (int i = 1; i < arrayDoub.length; i++)
            if (secondLargest != arrayDoub[i]){
                secondLargest = arrayDoub[i];
                break;}


        System.out.println("Second largest: " + secondLargest);
    }
}
