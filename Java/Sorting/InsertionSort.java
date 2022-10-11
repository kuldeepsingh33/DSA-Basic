/*Insertion Sorting
Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands. The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part.
Characteristics of Insertion Sort:
-This algorithm is one of the simplest algorithm with simple implementation
-Basically, Insertion sort is efficient for small data values
-Insertion sort is adaptive in nature, i.e. it is appropriate for data sets which are already partially sorted.
Insertion Sort Algorithm
The insertion sort algorithm is as follows.
Step 1: Repeat Steps 2 to 5 for K = 1 to A.length-1
Step 2: set temp = A[K]
Step 3: set J = K – 1
Step 4:
Repeat while temp <=A[J]
set A[J + 1] = A[J]
set J = J – 1
[end of inner loop]
Step 5:
set A[J + 1] = temp
[end of loop]
Step 6: exit
*/

 public class InsertionSort{
public static void main(String[] args) {  
   
      int a[]={15,77,45,32,100};

    System.out.println("Original Array:" );
    for(int i=0;i<a.length;i++)
    System.out.print(a[i]+" ");
    
    System.out.println();
    
    for(int k=1; k<a.length-1; k++)   {  
        int temp = a[k];  
        int j= k-1;  
        while(j>=0 && temp <= a[j])   {  
            a[j+1] = a[j];   
            j = j-1;  
        }  
        a[j+1] = temp;  
    }  
    
    System.out.println("Sorted Array:" );
    for(int i=0;i<a.length;i++)
    System.out.print(a[i]+" ");
}  
}