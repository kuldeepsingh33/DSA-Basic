/*
Binary Search algorithm is a searching algorithm particularly suited for an already sorted array.
In this, search is conducted by using the middle element as pivot.
- Begin with the mid element of the whole array as a search key.
- If the value of the search key is equal to the item then return an index of the search key.
- if the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half by fixing the upper index to one less than mid.
- Otherwise, narrow it to the upper half by fixing the lower index to mid + 1.
Repeatedly check from the second point until the value is found or the interval is empty.
 */
package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {-3, -1, 0, 4, 11, 20, 23, 25, 30, 40};

        int target = 19;
        int index = binarySearch(numbers, target);
        displayResult(index);

        target = 23;
        index = binarySearch(numbers, target);
        displayResult(index);
    }

    private static void displayResult(int index) {
        if (index == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element present at " + (index + 1) + " index");
    }

    static int binarySearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        int low = 0;
        int high = arr.length - 1;

        //run a while loop
        while (low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == target)
                return mid;
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else
                high = mid - 1;
        }


        // this line will execute if high < low
        // hence the target not found
        return -1;
    }
}
