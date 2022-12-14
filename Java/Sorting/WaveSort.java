
/**
 * An array arr[0..n-1] is sorted in wave form if:
 *          arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= ..... 
**/
import java.util.*;
public class WaveSort
{
    //method to swap two numbers.
    static void swap(int arr[], int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
 
    static void wavesort(int a[], int n)
    {
    	for(int i = 0; i < n-1; i+=2){
            //swap odd and even positions
            if(i > 0 && a[i - 1] > a[i])
            	swap(a, i, i-1);
            if(i < n-1 && a[i + 1] > a[i])
            	swap(a, i, i+1);
    	}
    }
 
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter length of array:");
    	int n = sc.nextInt();
    	int[] a = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i<n; i++)
        	a[i] = sc.nextInt();
        wavesort(a, n);
        for (int i : a)
            System.out.print(i + " ");
        sc.close();
    }
}