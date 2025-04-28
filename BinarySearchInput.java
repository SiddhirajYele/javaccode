import java.util.Scanner;
import java.util.Arrays;

public class BinarySearchInput {

    // Binary Search Method
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Element found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking array size from user
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Taking array elements from user
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Taking target value from user
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        // Make sure the array is sorted
        Arrays.sort(arr); // Optional if user inputs sorted array

        // Perform binary search
        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        scanner.close();
    }
}
