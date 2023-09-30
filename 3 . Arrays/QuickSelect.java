import java.util.Random;

public class QuickSelect {

    public static int quickSelect(int[] arr, int left, int right, int k) {
        if (left == right) {
            return arr[left];
        }

        int pivotIndex = partition(arr, left, right);
        
        if (k == pivotIndex) {
            return arr[k];
        } else if (k < pivotIndex) {
            return quickSelect(arr, left, pivotIndex - 1, k);
        } else {
            return quickSelect(arr, pivotIndex + 1, right, k);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        int randomPivot = new Random().nextInt(right - left + 1) + left;
        swap(arr, randomPivot, right);
        int pivot = arr[right];
        int i = left - 1;
        
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, right);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2; // Find the 3rd smallest element

        int result = quickSelect(arr, 0, arr.length - 1, k);
        System.out.println("The " + (k + 1) + "th smallest element is: " + result);
    }
}
/*This Java program implements the QuickSelect algorithm to find the k-th smallest element in an unsorted array. Here's a concise description of its key components and functionality:

quickSelect method:

Finds the k-th smallest element in the array by recursively partitioning it.
It compares the pivot index with k to determine whether to continue the search in the left or right subarray.
If k is equal to the pivot index, it returns the element at that index as the k-th smallest.
If k is less than the pivot index, it searches in the left subarray; otherwise, it searches in the right subarray.
partition method:

Chooses a random pivot element from the subarray to improve performance.
Rearranges the elements in the subarray so that elements less than the pivot are on the left, and elements greater than the pivot are on the right.
Returns the final position of the pivot element.
swap method:

Swaps two elements in the array.
main method:

Initializes an array of integers and specifies the value of k to find the k-th smallest element.
Calls the quickSelect method to find the k-th smallest element in the array.
Prints the result, indicating the k-th smallest element found in the array.
This program demonstrates the QuickSelect algorithm, which efficiently finds the k-th smallest element in an unsorted array with an average time complexity of O(n), where n is the length of the array.*/





Regenerate

