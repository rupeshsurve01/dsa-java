import java.util.*;

public class Hashing {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n;
        // System.out.println("Enter Size of the Array: ");
        // n = sc.nextInt();

        // System.out.println("Enter Elements of array");
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // for(int j = 0 ; j < n; j++){
        //     System.out.println(arr[j]);
        // }

        // precompute:
        int[] hash = new int[13];
        // for (int i = 0; i < n; i++) {
        //     hash[arr[i]] += 1;
        // }

        for(int j = 0 ; j < 13; j++){
            System.out.println(hash[j]);
        }


        // int q;
        // q = sc.nextInt();
        // while (q-- != 0) {
        //     int number;
        //     number = sc.nextInt();
        //     // fetching:
        //     System.out.println(hash[number]);
        // }
    }
}
