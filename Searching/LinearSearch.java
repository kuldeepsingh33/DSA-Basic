// Linear search is a very simple search algorithm. In this type of search, a sequential search is made over all items one by one.
//  Every item is checked and if a match is found then that particular item is returned, otherwise the search continues till the end
//  of the data collection .The linear search algorithm is easy to implement and efficient in two scenarios:

// When the list contains lesser elements 
// When searching for a single element in an unordered array
package Searching;

public class LinearSearch {
    public static void main(String[] args) {
	    int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
	    int target = 19;
	    int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}