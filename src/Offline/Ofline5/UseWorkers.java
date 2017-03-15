package Offline.Ofline5;

/**
 * Created by Lina.Burkalo on 23.02.2017.
 */
public class UseWorkers {
    public static void main(String[] args) {
        /* Worker[] array = new Worker[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Worker(1000 * i);
        }
        double sum = 0;

        for (Worker worker : array) {
            sum += worker.getSalary();
        } */

        Worker[] workers = new Worker[10];

        for (int i = 0; i < workers.length; i++) {
            if (1%2 == 0) {
                workers[i] = new WorkerWithFixedSalary(2 + i, "Petr", i * 1000); }
            else {
                workers[i] = new WorkerWithHourSalary(50 + i, "Vasya", i + 10);
                }
        }





        // Prepare testing data
        double rate = 30;
        int expectedResult = 4991;

        //
        WorkerWithHourSalary worker1 = new WorkerWithHourSalary(1, "Vasya", rate);

        double avgSalary = worker1.calculateAvgSalary();
        int compareResult = Double.compare(avgSalary, expectedResult);

        System.out.println(compareResult == 0 ? "Test passed" : "Test failed");


        // Prepare testing data
        double fixedSalary = 2000;
        int expectedResult1 = 2000;

        WorkerWithFixedSalary worker2 = new WorkerWithFixedSalary(2, "Petr", fixedSalary);

        double avgSalary1 = worker2.calculateAvgSalary();
        int compareResult1 = Double.compare(fixedSalary, expectedResult1);

        System.out.println(compareResult1 == 0 ? "Test passed" : "Test failed");


    }
}
