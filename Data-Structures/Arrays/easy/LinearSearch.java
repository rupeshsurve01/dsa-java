public class LinearSearch {

    public static void findElement(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            if (arr[i] == k) {
                System.out.println("Array is Present at index " + i);
                return;
            }
        }

        System.out.println("Array is not present");

    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 5, 3, 5, 7, 9 };

        findElement(arr1, 5);
    }
}
