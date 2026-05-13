public class Sum_of_N_no {

    public static int calculateSum(int n, int sum) {
        if (n == 0) {
            return sum;
        }

        sum += n;
        
        return calculateSum(n - 1, sum);

    }

    public static void main(String[] args) {
        int sum = 0;
        int n = 10;

        System.out.println("Sum of Digits from 1 to " + n + " is " + calculateSum(n, sum));

    }
}
