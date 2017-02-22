package Module4.homework4;

/**
 * Created by Lina.Burkalo on 22.02.2017.
 */
public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank userBank = user.getBank();

        double commission = userBank.getCommission(amount) / 100.0;
        if (userBank.getLimitOfWithdrawal() >= (amount + (amount * commission))) {
            double newBalance = user.getBalance() - amount - (amount * commission);
            user.setBalance(newBalance);
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        Bank userBank = user.getBank();

        if (amount <= userBank.getLimitOfFunding()) {
            double newBalance = user.getBalance() + amount;
            user.setBalance(newBalance);
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        Bank userBank1 = fromUser.getBank();
        Bank userBank2 = toUser.getBank();

        double commission = userBank1.getCommission(amount) / 100;
        if (userBank1.getLimitOfWithdrawal() >= amount + amount * commission) {
            double newBalance = fromUser.getBalance() - amount - amount * commission;
            fromUser.setBalance(newBalance);
        }

        if (amount <= userBank2.getLimitOfFunding()) {
            double newBalance = toUser.getBalance() + amount;
            toUser.setBalance(newBalance);

        }
    }

    @Override
    public void paySalary(User user) {
        double newBalance = user.getBalance() + user.getSalary();
        user.setBalance(newBalance);
    }

}
