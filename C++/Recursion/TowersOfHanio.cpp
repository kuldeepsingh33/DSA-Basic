#include <iostream>
using namespace std;


/*
    Towers of Hanoi

        1. First n-1 from the first tower should be shifted to auxilarly (centre one)
        2. The nth(bottomost) can now be shifted to the last/destination
        3. n-1 from auxillary should be put back into destination (this time using )

*/
//  n - number of disks
void towerOfHanio(int n, int src, int aux, int dest)
{
    if (n == 1)
    {
        cout << "Moving " << n << " from " << src << " to " << dest << endl;
        return;
    }
    // moving n numberOfDisks from source to destination using auxillary tow

    // move n-1 from src to aux ( to place nth disk at the destination first )
    towerOfHanio(n - 1, src, dest, aux); // moving n-1 from source to aux via dest
    // move nth disk from src to dest, (as it is free to move now)
    cout << "Moving " << n << " from " << src << " to " << dest << endl;

    // moving n-1 from aux to dest via start (thus finishing the problem)
    towerOfHanio(n - 1, aux, src, dest);
}

int main()
{
    int n;
    cout << "Enter number of disks : ";
    cin >> n;

    towerOfHanio(n, 0, 1, 2);
    return 0;
}
