package Offline.Ofline5;

/**
 * Created by Lina.Burkalo on 02.03.2017.
 */
public class WorkerWithHourSalary extends Worker {

    private final int i;
    private final String vasya;
    private double rate;

    public double getRate() {
        return rate;
    }

    public WorkerWithHourSalary(int i, String vasya, double rate) {
        this.i = i;
        this.vasya = vasya;
        this.rate = rate;
    }

    @Override
    public double calculateAvgSalary() {
        return  20.8 * 8 * rate;
    }
}
