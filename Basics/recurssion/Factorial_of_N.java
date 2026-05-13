public class Factorial_of_N {
    
    public static int findFactorial(int n, int fact){

        if (n == 0){
            return fact;
        }

        fact *= n;
        return findFactorial(n -1 , fact);
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5 is " + findFactorial(5, 1));
    }
}
