package Module4.homework4;

/**
 * Created by Lina.Burkalo on 22.02.2017.
 */
public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limitOfWithdrawal;
        if (getCurrency() == Currency.USD) {
            limitOfWithdrawal = 2000; }
        else {
            limitOfWithdrawal = 2200; }

        return limitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        int limitOfFunding;
        if (getCurrency() == Currency.USD) {
            limitOfFunding = 10000; }
        else {
            limitOfFunding = 20000; }
        return limitOfFunding;
    }

    @Override
    int getMonthlyRate() {
        int rate;
        if (getCurrency() == Currency.USD) {
            rate = 0; }
        else {
            rate = 1; }
        return rate;
    }

    @Override
    int getCommission(int summ) {
        int commission;
        if (getCurrency() == Currency.USD) {
            if (summ <= 1000)
                commission = 5;
            else
                commission = 7;
        }
        else {
            if (summ <= 1000)
                commission = 2;
            else
                commission = 4;
        }
        return commission;
    }

}