// Get the Minimum Element from the array & Swap it with it's correct position.
// TC -> O(n^2)
public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = { 34,2,5,75,8,33,35 };
        int n = arr.length;


        for (int i = 0; i < n - 1; i++) {

            int smallest = i;
            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }

        for (int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }

}
