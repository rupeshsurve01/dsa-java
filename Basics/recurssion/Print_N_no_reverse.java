public class Print_N_no_reverse {
    
    public static void printN(int n){
        if(n < 1) return ;
       
        System.out.println(n);

        printN(n-1);
    }

    public static void main(String[] args) {
        printN(5);
    }
}
