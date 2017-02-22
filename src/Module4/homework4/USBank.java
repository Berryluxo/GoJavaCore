package Module4.homework4;

/**
 * Created by Lina.Burkalo on 22.02.2017.
 */
public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limitOfWithdrawal;
        if (getCurrency() == Currency.USD) {
            limitOfWithdrawal = 1000; }
        else {
            limitOfWithdrawal = 1200; }
        return limitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        int limitOfFunding;
        if (getCurrency() == Currency.EUR)
            limitOfFunding = 10000;
        else
            limitOfFunding = 0;
        return limitOfFunding;
    }

    @Override
    int getMonthlyRate() {
        int rate;
        if (getCurrency() == Currency.USD)
            rate = 1;
        else
            rate = 2;
        return rate;
    }

    @Override
    int getCommission(int amount) {
        int commission;
        if (getCurrency() == Currency.USD) {
            if (amount <= 1000)
                commission = 5;
            else
                commission = 7; }
        else {
            if (amount <= 1000)
                commission = 6;
            else
                commission = 8; }

        return commission;
    }
}