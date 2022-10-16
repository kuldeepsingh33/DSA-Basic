package Searching;

import java.util.Scanner;

public class BinarySearch0 {
    public static void main(String[] args) {
        //taking input of array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array in ascending order");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //taking input of target
        System.out.println("Enter your target");
        int target = sc.nextInt();

        //printing out the answer
        int ans = binarySearch(arr, target);
        System.out.println("Target is at index : " + ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            //finding middle element
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //answer found
                return mid;
            }
        }
        return -1;
    }
}
