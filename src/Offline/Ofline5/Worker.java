package Offline.Ofline5;

/**
 * Created by Lina.Burkalo on 23.02.2017.
 */
public abstract class Worker extends Person {

    private String address;
    private double salary;

    public Worker() {

    }

    public Worker(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public abstract double calculateAvgSalary();
}
