import java.sql.Time;

public class Left_Rotate_byOne {

    // Brute Force
    // Time Complexity: O(N), where N is the size of the input array. This is
    // because we traverse the array once to shift the elements.

    public static void rotateArrayByOne(int[] arr) {

        int n = arr.length;
        int[] temp = new int[n];

        for (int i = 1; i < n; i++) {
            temp[i - 1] = arr[i];
        }

        temp[n - 1] = arr[0];

        System.out.println("Rotated Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }

    // Optimal
    // Space Complexity: O(1), as we are using only a constant amount of extra space
    // for the temporary variable.
    public static void rotateArrayByOne2(int[] arr) {

        int n = arr.length;
        int temp = arr[0];

        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }

        arr[n - 1] = temp;

        System.out.println("Rotated Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };

        System.out.println("Original Array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        rotateArrayByOne2(nums);
    }
}
