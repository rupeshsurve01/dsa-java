/*
 * GCD (Greatest Common Divisor)
 * HCF (Highest Common Factor)
 *
 * The largest number that divides both numbers exactly.
 */

public class GCD {

    // Brute Force Approach
    // Time Complexity: O(min(a, b))
    public static int gcdBruteForce(int a, int b) {

        int gcd = 1;

        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    // Better Approach
    // Time Complexity: O(min(a, b))
    public static int gcdBetter(int a, int b) {

        for (int i = Math.min(a, b); i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }

        return 1;
    }

    // Euclidean Algorithm (Optimal)
    // Time Complexity: O(log(min(a, b)))
    public static int gcdEuclidean(int a, int b) {

        while (a > 0 && b > 0) {

            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        return (a == 0) ? b : a;
    }

    public static void main(String[] args) {

        int n1 = 20;
        int n2 = 15;

        int gcd = gcdEuclidean(n1, n2);

        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }
}