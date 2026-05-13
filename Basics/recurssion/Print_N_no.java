

class Print_N_no {

    public static void printNo(int n, int i){


        if (i >= n) return;

        System.out.println(i);

        printNo(n, i+1);
    }

    public static void main(String[] args) {
        int i = 1;
        printNo(5,i);
    }
    
}