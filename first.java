import java.util.Arrays;

class Solution {
    public void reverseArray(int arr[]) {
        int n = arr.length;
        int[] temp = new int[n];

        int i;

        // Store elements in reverse order
        for (i = 0; i < n; i++) {
            temp[i] = arr[n - i - 1];
        }

        // Copy back to original array
        for (i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        Solution obj = new Solution();
        obj.reverseArray(arr);

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}