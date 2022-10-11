/*
Bubble sort is a sorting algorithm that compares two adjacent elements and swaps them until they are in the intended order. Similar to the movement of air bubbles in the water that rise up to the surface, each element of the array move to the end in each iteration. Hence, it is called a bubble sort.
- Starting from the first index, compare the first and the second elements.
- If the first element is greater than the second element, they are swapped.
- Now, compare the second and the third elements. Swap them if they are not in order.
- The above process goes on until the last element.
 */

public class BubbleSort {
    public static void main(String args[]) {

        int[] data = {-2, -5, 45, 0, 11, -9, 20};

        bubbleSort(data);

        System.out.println("Sorted Array in Ascending Order:");
        displayResult(data);
    }

    private static void displayResult(int[] data) {
        for(int i = 0; i < data.length; i++)
            System.out.print(data[i] + " ");
        System.out.println();
    }

    private static void bubbleSort(int[] data) {
        int size = data.length;
        // loop to access each array element
        for (int i = 0; i < size - 1; i++)
            // loop to compare array elements
            for (int j = 0; j < size - i - 1; j++)
                // compare two adjacent elements
                // change > to < to sort in descending order
                if (data[j] > data[j + 1]) {
                    // swapping occurs if elements are not in the intended order
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
    }
}
