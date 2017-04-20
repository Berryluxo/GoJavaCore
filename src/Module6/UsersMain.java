package Module6;

import java.util.Arrays;


/**
 * Created by Lina.Burkalo on 05.04.2017.
 */
public class UsersMain {
    public static void main(String[] args) {

        User[] users = new User[10];

        users[0] = new User(555, "Stefanya", "Ambrosio", 50000, 456236);
        users[1] = new User(7, "Harrison", "Ford", 128799, 7855555);
        users[2] = new User(89, "Bred", "Pit", 700000, 87899555);
        users[3] = new User(6, "Taylor", "Swift", 566666, 23222222);
        users[4] = new User(7888, "Kate", "Middleton", 12233, 878845);
        users[5] = null;
        users[6] = new User(14, "Scarlet", "Yohanson", 123666, 7888889);
        users[7] = new User(32, "Pharell", "Williams", 452321, 45555555);
        users[8] = new User(7, "Harrison", "Ford", 128799, 7855555);
        users[9] = new User(23, "Blake", "Lavli", 5211111, 33333333);



        System.out.println("Finds and returns unique users " + Arrays.toString(UserUtils.uniqueUsers(users)));

        System.out.println("Finds and returns the user whose balance is equal to given balance " + Arrays.toString(UserUtils.usersWithContitionalBalance(users, 33333333)));

        System.out.println("Pay salary to each user balance " + Arrays.toString(UserUtils.paySalaryToUsers(users)));

        System.out.println("Returns an array of user IDs " + Arrays.toString(UserUtils.getUsersId(users)));

        System.out.println("Finds and removes empty elements of the array " + Arrays.toString(UserUtils.deleteEmptyUsers(users)));
    }
}
