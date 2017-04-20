package Module6;

import java.util.Arrays;

/**
 * Created by Lina.Burkalo on 05.04.2017.
 */
public class UserUtils {

    //находит и возвращает уникальных пользователей (пользователи одинаковы, когда все их поля совпадают)
    public static User[] uniqueUsers(User[] users){
        User temp[] = new User[users.length];

        temp[0] = users[0];
        int count = 1;

        for (int i = 1; i < users.length; i++) {
            boolean bool = true;
            for (int j = 0; j < count; j++) {
                if (users[ i ] == null || users[i].equals(temp[j])) {
                    bool = false;
                    break;
                }
            }
            if (bool) {
                temp[count] = users[i];
                count++;
            }
        }

        User[] unique = new User[count];
        System.arraycopy(temp, 0, unique, 0, count);
        return unique;
    }

    //находит и возвращает пользователей, чей баланс равен заданному
    public static User[] usersWithContitionalBalance(User[] users, int balance) {
        User[] temp = new User[users.length];

        int count = 0;

        for (int i = 0; i < users.length; i++) {
            if (users[ i ] == null) continue;
            else if (users[i].getBalance() == balance) {
                temp[count] = users[i];
                count++;
            }
        }

        User[] usWithContBal = new User[count];
        System.arraycopy(temp, 0, usWithContBal, 0, count);
        return usWithContBal;
    }

    //начисляет зарплату в баланс каждому пользователю
    public final static User[] paySalaryToUsers(User[] users) {
        User[] temp = new User[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[ i ] == null) continue;
            else if (users[i] == null) continue;
            else
                temp[i] = new User(users[i].getId(), users[i].getFirstName(), users[i].getLastName(),
                        users[i].getSalary(), users[i].getBalance() + users[i].getSalary());
        }
        return temp;
    }

    //paySalaryToUsers and getUsersId methods can’t be overriden in other classes

    //возвращает массив идентификаторов пользователей
    public final static long[] getUsersId(User[] users) {
        long[] usersId = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[ i ] == null) continue;
            else usersId[i] = users[i].getId();
        }
        return usersId;
    }

    //находит и удаляет пустые элементы из массива (в результате возвращается новый массив с меньшим размером)
    public static User[] deleteEmptyUsers(User[] users) {
        User[] deletedEmptyUsers = new User[users.length];
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                deletedEmptyUsers[count] = users[i];
                count++;
            }
        }
        deletedEmptyUsers = Arrays.copyOf(deletedEmptyUsers, count);
        return deletedEmptyUsers;
    }
}
