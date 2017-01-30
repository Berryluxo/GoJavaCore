package Module2;

/**
 * Created by Lina.Avramenko on 30.01.2017.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        String ownerName;
        double fund;
        result(balances, ownerNames, "Oww", 100);

    }

    static void result(int[] balances, String[] ownerNames, String ownerName, double fund) {
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                double result = balances[i] + fund;
                if ((result % 1) > 0)
                    System.out.println(result);
                else
                    System.out.println((int)result);
            }
        }
    }
}

