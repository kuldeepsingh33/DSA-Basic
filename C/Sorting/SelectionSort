#include <stdio.h>
#include <stdlib.h>

void selectionSort(int* arr, int n){
    for(int i = 0; i<n-1; i++){
        int k = i;
        int j = i+1;
        while(j<n){
            if(arr[k] > arr[j]){
                k = j;
            }
            j++;
        }
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
        printf("Pass %d:\n", i+1);
        for(int i = 0; i<n; i++){
            printf("%d ", arr[i]);
        }
        printf("\n");
    }
}

int main(){
    int *arr;
    int n;
    printf("Enter the size of array: \n");
    scanf("%d", &n);
    arr = (int *)malloc(sizeof(int)*n);
    printf("Enter the values of Array: \n");
    for(int i = 0; i<n; i++){
        scanf("%d", &arr[i]);
    }
    selectionSort(arr,n);
    printf("Selection Sorted Array: ");
    for(int i = 0; i<n; i++){
        printf("%d ", arr[i]);
    }
}
