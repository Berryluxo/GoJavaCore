package Module3;

/**
 * Created by Lina.Burkalo on 15.02.2017.
 */
public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    // Метод добавляет заработную плату к балансу пользователя
    public int paySalary() {
        balance += salary;
        return balance;
    }

    // Метод снимает деньги с баланса с комиссией 5%, если сумма < 1000 и комиссией 10% в других случаях
    public double withdraw(int summ) {
        double resWithdraw;
        if (summ < 1000)
            resWithdraw = balance - summ - (summ * 5 / 100);
        else
            resWithdraw = balance - summ - (summ * 10 / 100);
        return resWithdraw;
    }

    // Метод вычисляет длину имя компании
    public int companyNameLenght() {
        int resCompanyNameLenght = companyName.length();
        return resCompanyNameLenght;
    }

    // Метод увеличивает monthsOfEmployment на addMonth
    public int monthIncreaser(int addMonth) {
        monthsOfEmployment += addMonth;
        return monthsOfEmployment;
    }
}
