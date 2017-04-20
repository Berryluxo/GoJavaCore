package Offline.Offline5;

/**
 * Created by Lina.Burkalo on 02.03.2017.
 */
public class WorkerWithFixedSalary extends Worker {

    private final int salary;
    private final String petr;
    private double fixedSalary;

    public WorkerWithFixedSalary(int salary, String petr, double fixedSalary) {
        this.salary = salary;
        this.petr = petr;
        this.fixedSalary = fixedSalary;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    @Override
    public double calculateAvgSalary() {
        return fixedSalary;
    }
}
