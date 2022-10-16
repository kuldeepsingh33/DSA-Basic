import java.util.*;


public class heap {

    int arr[];
    boolean max;

    heap(int arr[], boolean max){
        int n = arr.length;
        this.arr = arr;
        this.max = max;

        for(int i=n-1;i>=0;i--){
            downheapify(arr,i,max);
        }
    }

    public void swap(int arr[], int x, int y ){
        int z = arr[x];
        arr[x]= arr[y];
        arr[y]= z;
    }

    public boolean compareTo(int arr[], int tar, int par, boolean max ){
        if(max){
            // comparison for max heap
            return arr[tar]-arr[par] >=0;
        }else{
            // comparison for min heap
            return arr[par]-arr[tar] >0;
        }
    }

    // Dowheapify - this method ensures movement from top to down
    // max - if true this is a max heap else min heap
    public void downheapify(int arr[], int idx , boolean max ){

        int li = 2*idx + 1;
        int ri = 2*idx + 2;

        if(li<arr.length && compareTo(arr, li, idx, max)){
            swap(arr, idx, li);
            downheapify(arr,li,max);
        }
        if(ri<arr.length && compareTo(arr, ri, idx, max)){
            swap(arr, idx, ri);
            downheapify(arr,ri,max);
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<this.arr.length;i++){
            sb.append(arr[i]+"  ---   ");
        }
        return sb.toString();
    }
}
