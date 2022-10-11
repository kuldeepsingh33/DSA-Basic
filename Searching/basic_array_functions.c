int deleteElement(int arr[], int n, int key)
{
    // Find position of element to be deleted
    int pos = findElement(arr, n, key);
 
    if (pos == -1) {
        printf("Element not found");
        return n;
    }
 
    // Deleting element
    int i;
    for (i = pos; i < n - 1; i++)
        arr[i] = arr[i + 1];
 
    return n - 1;
}


int findElement(int arr[], int n, int key);



// Function to delete an element


void insertElement(int arr[], int n, int x, int pos)
{
    // shift elements to the right
    // which are on the right side of pos
    for (int i = n - 1; i >= pos; i--)
        arr[i + 1] = arr[i];
 
    arr[pos] = x;
}

int deleteElement(int arr[], int n, int key)
{
    // Find position of element to be deleted
    int pos = findElement(arr, n, key);
 
    if (pos == -1) {
        printf("Element not found");
        return n;
    }
 
    // Deleting element
    int i;
    for (i = pos; i < n - 1; i++)
        arr[i] = arr[i + 1];
 
    return n - 1;
}
 
// Function to implement search operation
int findElement(int arr[], int n, int key)
{
    int i;
    for (i = 0; i < n; i++)
        if (arr[i] == key)
            return i;
 
    return -1;
}
 
// Driver's code
int main()
{
    int i;
    int arr[] = { 10, 50, 30, 40, 20 };
 
    int n = sizeof(arr) / sizeof(arr[0]);
    int key = 30;
 
    printf("Array before deletion\n");
    for (i = 0; i < n; i++)
        printf("%d  ", arr[i]);
     
      // Function call
    n = deleteElement(arr, n, key);
 
    printf("\nArray after deletion\n");
    for (i = 0; i < n; i++)
        printf("%d  ", arr[i]);
  
  n = deleteElement(arr, n, key);
 
    printf("\nArray after deletion\n");
    for (i = 0; i < n; i++)
        printf("%d  ", arr[i]);
  
  insertElement(arr, n, x, pos);
    n++;
 
    printf("After insertion : ");
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);
 
    return 0;
}
