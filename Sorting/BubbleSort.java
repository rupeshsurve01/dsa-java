import java.sql.Time;

class BubbleSort {

    // Brute Force Approach
    // Time Complexity: O(N2), (where N = size of the array), for the worst, and
    // average cases.
    // Space Complexity: O(1).

    public void bubbleSort2(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) { // Use two nested loops to iterate over the array
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j]; // Swap arr[j+1] with arr[i];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("After Using Bubble Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Optimal Approach
    // Time Complexity:O(N2) for the worst and average cases and O(N) for the best
    // case. Here, N = size of the array.
    // Space Complexity:O(1)
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) { // Use two nested loops to iterate over the array
            boolean didSwap = false;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1]; // Swap arr[j+1] with arr[i]
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    didSwap = true;
                }
            }
            if (!didSwap) {
                break;
            }
        }

        System.out.println("After Using Bubble Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };

        System.out.println("Before Using Bubble Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        BubbleSort sorter = new BubbleSort();
        sorter.bubbleSort(arr);
    }
}
