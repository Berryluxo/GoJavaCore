package Module2;

/**
 * Created by Lina.Avramenko on 30.01.2017.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        String ownerName;
        result(balances, ownerNames, "Jack", 250);
    }

    static void result(int[] balances, String[] ownerNames, String ownerName, double withdrawal) {
        int commision = 5;

        double comTrans = withdrawal * (double) commision / 100;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                double result = balances[i] - withdrawal - comTrans;
                if (result >= 0)
                    System.out.println(ownerNames[i] + " " + (int)withdrawal + " " + result);
                else
                    System.out.println("Oww NO");
            }
        }

    }
}
