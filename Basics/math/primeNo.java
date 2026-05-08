import java.util.Scanner;

class primeNo {

    // Brute Force Method
    static boolean isPrimeBruteForce(int num) {

        int cnt = 0;

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                cnt++;
            }
        }

        return cnt == 2;
    }

    // Optimized Method
    static boolean isPrimeOptimized(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Brute Force Result
        if (isPrimeBruteForce(num)) {
            System.out.println("Brute Force: Prime Number");
        } else {
            System.out.println("Brute Force: Not Prime Number");
        }

        // Optimized Result
        if (isPrimeOptimized(num)) {
            System.out.println("Optimized: Prime Number");
        } else {
            System.out.println("Optimized: Not Prime Number");
        }

        sc.close();
    }
}


// Brute Force Function - O(n)
// Optimized Function O(sqrroot(n))
// Space Complexity for Both - O(1)