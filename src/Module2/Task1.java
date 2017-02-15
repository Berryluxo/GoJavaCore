package Module2;

/**
 * Created by Lina.Avramenko on 29.01.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] array = {32, -4, 17, -6, -129, -49, 10, 38, 548, 22};
        double[] arrayDoub = {52.4, -45.7, 6.7, 155.1, 633.9, -4.6, 7.2, 1.4, -111.5, -0.8};
        System.out.println("Sum: " + sum(array));
        System.out.println("Sum: " + sum(arrayDoub));
        System.out.println("Min: " + min(array));
        System.out.println("Min: " + min(arrayDoub));
        System.out.println("Max: " + max(array));
        System.out.println("Max: " + max(arrayDoub));
        System.out.println("Max positive: " + maxPositive(array));
        System.out.println("Max positive: " + maxPositive(arrayDoub));
        System.out.println("Multiplication: " + multiplication(array));
        System.out.println("Multiplication: " + multiplication(arrayDoub));
        System.out.println("Modulus: " + modulus(array));
        System.out.println("Modulus: " + modulus(arrayDoub));
        System.out.println("Second largest: " + secondLargest(array));
        System.out.println("Second largest: " + secondLargest(arrayDoub));

    }

    // Calculate sum for int
    static int sum(int array[]) {
        int sumArray = 0;
        for (int sArray : array) {
            sumArray += sArray;
        }
        return sumArray;
    }

    // Calculate sum for double
    static double sum(double arrayDoub[]) {
        double sumArray = 0;
        for (double sArray : arrayDoub) {
            sumArray += sArray;
        }
        return sumArray;
    }

    // Calculate min for int
    static int min(int array[]) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    // Calculate min for double
    static double min(double arrayDoub[]) {
        double min = arrayDoub[0];
        for (int i = 0; i < arrayDoub.length; i++) {
            if (min > arrayDoub[i]) {
                min = arrayDoub[i];
            }
        }
        return min;
    }

    // Calculate max for int
    static int max(int array[]) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        return max;
    }

    // Calculate max for double
    static double max(double arrayDoub[]) {
        double max = arrayDoub[0];
        for (int i = 0; i < arrayDoub.length; i++) {
            if (max < arrayDoub[i])
                max = arrayDoub[i];
        }
        return max;
    }

    // Calculate max positive for int
    static int maxPositive(int array[]) {
        int maxPositive = 0;
        for (int anArray : array) {
            if (anArray > 0 && maxPositive < anArray)
                maxPositive = anArray;
        }
        return maxPositive;
    }

    // Calculate max positive for double
    static double maxPositive(double arrayDoub[]) {
        double maxPositive = 0;
        for (double anArray : arrayDoub) {
            if (anArray > 0 && maxPositive < anArray)
                maxPositive = anArray;
        }
        return maxPositive;
    }

    // Calculate multiplication for int
    static int multiplication(int array[]) {
        int multiplication = 1;
        for (int i = 0; i < array.length; i++) {
            multiplication = multiplication * array[i];
        }
        return multiplication;
    }

    // Calculate multiplication for double
    static double multiplication(double arrayDoub[]) {
        double multiplication = 1;
        for (int i = 0; i < arrayDoub.length; i++) {
            multiplication = multiplication * arrayDoub[i];
        }
        return multiplication;
    }

    // Calculate modulus of first and last element for int
    static int modulus(int array[]) {
        int modulus = array[0] % array[array.length - 1];
        return modulus;
    }

    // Calculate modulus of first and last element for double
    static double modulus(double arrayDoub[]) {
        double modulus = arrayDoub[0] % arrayDoub[arrayDoub.length - 1];
        return modulus;
    }

    // Calculate second largest element for int
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

    // Calculate second largest element for double
    static double secondLargest(double arrayDoub[]) {
        double largest = 0;
        double previousLarger = 0;
        for (int i = 0; i < arrayDoub.length; i++) {
            if (arrayDoub[i] > largest) {
                previousLarger = largest;
                largest = arrayDoub[i];
            }
        }
        return previousLarger;
    }
}