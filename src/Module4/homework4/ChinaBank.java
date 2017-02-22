package Module4.homework4;

/**
 * Created by Lina.Burkalo on 22.02.2017.
 */
public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limitOfWithdrawal;
        if (getCurrency() == Currency.USD) {
            limitOfWithdrawal = 100; }
        else {
            limitOfWithdrawal = 150; }

        return limitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        int limitOfFunding;
        if (getCurrency() == Currency.USD) {
            limitOfFunding = 10000; }
        else {
            limitOfFunding = 5000; }
        return limitOfFunding;
    }

    @Override
    int getMonthlyRate() {
        int rate;
        if (getCurrency() == Currency.USD) {
            rate = 1; }
        else {
            rate = 0; }
        return rate;
    }

    @Override
    int getCommission(int summ) {
        int commission;
        if (getCurrency() == Currency.USD) {
            if (summ <= 1000)
                commission = 3;
            else
                commission = 5;
        }
        else {
            if (summ <= 1000)
                commission = 10;
            else
                commission = 11;
        }
        return commission;
    }
}
