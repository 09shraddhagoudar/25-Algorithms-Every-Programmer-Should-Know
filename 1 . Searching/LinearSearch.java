import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found, return -1
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search for: ");
        int target = sc.nextInt();

        int index = linearSearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}
/*This Java program implements the linear search algorithm to find the index of a target element in an array. Here's a concise description of its key components and functionality:

linearSearch method:

Performs linear search by iterating through the array from start to end.
Compares each element with the target element.
If the element is found, it returns its index.
If the entire array is searched without finding the target element, it returns -1 to indicate that the element was not found.
main method:

Accepts user input for the length of the array, the elements of the array, and the target element to search for.
Creates an integer array based on user input.
Calls the linearSearch method to find the index of the target element.
If the element is found (index != -1), it prints the index where the element was found.
If the element is not found, it prints a message indicating that the element was not found in the array.
This program is designed to search for a target element in an array using a simple linear search, making it suitable for small arrays or when the array is not sorted.*/






