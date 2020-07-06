package nix.util;

import nix.util.abstr.Sorting;

public class InsertionSort implements Sorting {
    private static long timeOfSorting = 0 ;

    public static long getTimeOfSorting() {
        return timeOfSorting;
    }

    public static void setTimeOfSorting(long timeOfSorting) {
        InsertionSort.timeOfSorting = timeOfSorting;
    }

    @Override
    public int [] sort(int arr[]){
        int n = arr.length;
        for( int i=1; i<n; ++i){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
