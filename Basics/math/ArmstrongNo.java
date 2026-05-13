public class ArmstrongNo {

    public static boolean isArmstrong(int n){

        int num = n;

        int k = String.valueOf(n).length();

        int sum = 0;

        while(n > 0){

            int lastD = n % 10;

            sum += (int)Math.pow(lastD, k);

            n /= 10; // Remove last digit
        }

        return sum == num;
    }

    public static void main(String[] args){

        int number = 153;

        // Use class method to check
        if (isArmstrong(number)) {

            System.out.println(number + " is an Armstrong number.");

        } else {

            System.out.println(number + " is not an Armstrong number.");
        }
    }
}