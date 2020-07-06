package nix.util;

import nix.util.abstr.Sorting;

import java.util.Arrays;

public class MergeSort implements Sorting {
    private static long timeOfSorting = 0 ;

    public static long getTimeOfSorting() {
        return timeOfSorting;
    }

    public static void setTimeOfSorting(long timeOfSorting) {
        MergeSort.timeOfSorting = timeOfSorting;
    }

    @Override
    public int[] sort(int[] arr) {
        return merge(arr, 0, arr.length-1);
    }

    private static int[] merge(int[] arr, int left, int right) {
        if (right > left) {
            int mid = left + (right - left) / 2;
            merge(arr, left, mid);
            merge(arr, mid + 1, right);

            int[] buf = Arrays.copyOf(arr, arr.length);

            for (int k = left; k <= right; k++)
                buf[k] = arr[k];

            int i = left, j = mid + 1;
            for (int k = left; k <= right; k++) {

                if (i > mid) {
                    arr[k] = buf[j];
                    j++;
                } else if (j > right) {
                    arr[k] = buf[i];
                    i++;
                } else if (buf[j] < buf[i]) {
                    arr[k] = buf[j];
                    j++;
                } else {
                    arr[k] = buf[i];
                    i++;
                }
            }
        }

        return arr;
    }




}
