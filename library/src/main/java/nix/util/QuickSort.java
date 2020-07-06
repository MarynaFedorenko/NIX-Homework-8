package nix.util;

import nix.util.abstr.Sorting;

public class QuickSort implements Sorting {
    private static long timeOfSorting = 0 ;

    public static long getTimeOfSorting() {
        return timeOfSorting;
    }

    public static void setTimeOfSorting(long timeOfSorting) {
        QuickSort.timeOfSorting = timeOfSorting;
    }

    @Override
    public int[] sort(int[] arr) {
        return partition(arr, 0, arr.length-1);
    }


    private static int[] partition(int[] arr, int left, int right) {
        int leftMarker = left;
        int rightMarker = right;
        int pivot = arr[(leftMarker + rightMarker) / 2];
        do {
            while (arr[leftMarker] < pivot) {
                leftMarker++;
            }
            while (arr[rightMarker] > pivot) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int tmp = arr[leftMarker];
                    arr[leftMarker] = arr[rightMarker];
                    arr[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < right) {
            partition(arr, leftMarker, right);
        }
        if (left < rightMarker) {
            partition(arr, left, rightMarker);
        }

        return arr;
    }


}
