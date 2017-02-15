package Module3;

/**
 * Created by Lina.Burkalo on 15.02.2017.
 */
public class UserResult {
    public static void main(String[] args) {
        User user1 = new User("Lina", 100000, 5, "Kyivstar", 10000, "dollar");

        user1.setName("Vasya");
        System.out.println(user1.getName());

        System.out.println(user1.companyNameLenght());
        System.out.println(user1.withdraw(999));
        System.out.println(user1.withdraw(1500));
        System.out.println(user1.monthIncreaser(6));
        System.out.println(user1.paySalary());
    }

}
