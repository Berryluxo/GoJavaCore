package Test;

/**
 * Created by Lina.Avramenko on 29.01.2017.
 */
public class test2 {

    public static void main(String []args){
        int myArray[] = {3,5,7,12};
        System.out.print(sum(myArray));
    }

    public static int sum(int [] arr) {
        return sum(arr, arr.length-1);
    }

    public static int sum(int [] arr, int n){
        if(n==0)
            return arr[0];
        else
            return arr[n]+ sum(arr,n-1);
    }
}


