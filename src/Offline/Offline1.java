package Offline;

import java.util.Arrays;

/**
 * Created by Lina.Avramenko on 28.01.2017.
 */
public class Offline1 {
    public static void main(String[] args) {
        int[] balances = {1000, 2000, 3000, 4000, 5000, 1256, 7563, 8000, 1456, 10000};
        int sum = 0;
        for (int balance : balances) {
            if (balance > 1000 && balance < 5000) {
                sum += balance;
            }
        }
            System.out.println("Result sum " + sum);

        String[] balancesOwners = {"own1", "own2", "own3", "own4", "own5", "own6", "own7", "own8", "own9", "own10"};

        String[] filteredNames = new String[balancesOwners.length];
        int index = 0;

        for (int i = 0; i < balancesOwners.length; i++) {
            if (balances[i] > 2000) {
                System.out.println(balancesOwners[i] + " balance " + balances[i]);
                filteredNames[index] = balancesOwners[i];
                index ++ ;
            }
        }
         for (String filteredName : filteredNames) {
            if (filteredName != null) {
                System.out.println(filteredName);
            }
         }
        System.out.println(Arrays.toString(filteredNames));


    }

    }


