package Module4.homework4;

/**
 * Created by Lina.Burkalo on 22.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        //Create Banks
        Bank usBank = new USBank(5665, "Ukraine", Currency.USD, 69, 6599.5, 566699, 7898655);
        Bank euBank = new EUBank(54, "France", Currency.USD, 180, 10444, 5, 855989899);
        Bank chinaBank = new ChinaBank(8, "China", Currency.USD, 450, 6588, 13, 9999878);

        BankSystem bankSystem = new BankSystemImpl();

        //Create User1 for USBank
        User user1 = new User(5, "User1", 6500.2, 3, "Romashka", 2333, usBank);

        System.out.println(user1);

        bankSystem.withdrawOfUser(user1, 800);
        System.out.println("Withdraw " + user1);

        //Create User2 for USBank
        User user2 = new User(45, "User2", 11587.0, 13, "PeterService", 4100, usBank);

        usBank.setCurrency(Currency.EUR);
        System.out.println(user2);

        bankSystem.withdrawOfUser(user2, 456);
        System.out.println("Withdraw " + user2);

        bankSystem.fundUser(user2, 123);
        System.out.println("Fund " + user2);

        bankSystem.transferMoney(user1, user2, 500);
        System.out.println("Transfer Money from " + user1);
        System.out.println("Transfer money to " + user2);

        bankSystem.paySalary(user1);
        System.out.println("Pay salary " + user1);
        System.out.println(" ");

        //Create User3 for EUBank
        User user3 = new User(144, "User3", 12364.3, 24, "Kyivstar", 1450, euBank);
        System.out.println(user3);

        bankSystem.withdrawOfUser(user3, 50);
        System.out.println("Withdraw " + user3);

        //Create User4 for EUBank
        User user4 = new User(566, "User4", 87777, 6, "Derembo", 5500, euBank);

        euBank.setCurrency(Currency.EUR);
        System.out.println(user4);

        bankSystem.withdrawOfUser(user4, 125);
        System.out.println("Withdraw " + user4);

        bankSystem.fundUser(user4, 633);
        System.out.println("Fund " + user4);

        bankSystem.transferMoney(user2, user4, 430);
        System.out.println("Transfer Money from " + user2);
        System.out.println("Transfer money to " + user4);

        bankSystem.paySalary(user4);
        System.out.println("Pay salary to " + user4);
        System.out.println(" ");

        //Create User5 for ChinaBank
        User user5 = new User(4, "User5", 478, 2, "Less", 600, chinaBank);

        System.out.println(user5);

        bankSystem.withdrawOfUser(user5, 1470);
        System.out.println("Withdraw " + user5);

        //Create User6 for ChinaBank
        User user6 = new User(98, "User6", 33698, 28, "Strong", 1000, chinaBank);

        chinaBank.setCurrency(Currency.EUR);
        System.out.println(user6);

        bankSystem.withdrawOfUser(user6, 1123);
        System.out.println("Withdraw " + user6);

        bankSystem.fundUser(user6, 14788);
        System.out.println("Fund " + user6);

        bankSystem.transferMoney(user3, user6, 230);
        System.out.println("Transfer Money from " + user3);
        System.out.println("Transfer money to " + user6);

        bankSystem.paySalary(user5);
        System.out.println("Pay salary to " + user5);

    }
}
