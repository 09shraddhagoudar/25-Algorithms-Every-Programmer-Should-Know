import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Element found, return its index
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Element not found, return -1
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the sorted array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];

        System.out.println("Enter the sorted elements of the array:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search for: ");
        int target = sc.nextInt();

        // Binary search requires a sorted array, so we'll sort it first.
        Arrays.sort(arr);

        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}
/*This Java program implements the binary search algorithm to find the index of a target element in a sorted array. Here's a brief description of its key components and functionality:

binarySearch method:

Performs binary search on a sorted integer array to find the index of a target element.
Maintains two pointers, left and right, initially set to the start and end of the array, respectively.
Iteratively calculates the middle index (mid) and compares the middle element to the target.
If the middle element equals the target, it returns the index of the element.
If the middle element is less than the target, it updates left to mid + 1 to search in the right half.
If the middle element is greater than the target, it updates right to mid - 1 to search in the left half.
Continues the process until the target is found or the search range is exhausted.
main method:

Accepts user input for the length of a sorted array, the sorted elements of the array, and the target element to search for.
Creates an integer array based on user input and sorts it using Arrays.sort.
Calls the binarySearch method to find the index of the target element.
If the element is found (index != -1), it prints the index where the element was found.
If the element is not found, it prints a message indicating that the element was not found in the array.
This program is designed to search for a target element efficiently in a sorted array using binary search, making it suitable for large arrays where traditional linear search would be less efficient.*/






