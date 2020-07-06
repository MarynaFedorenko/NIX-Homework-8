package nix.util;

import nix.util.abstr.Sorting;

public class ShuttleSort implements Sorting {
    private static long timeOfSorting = 0 ;

    public static long getTimeOfSorting() {
        return timeOfSorting;
    }

    public static void setTimeOfSorting(long timeOfSorting) {
        ShuttleSort.timeOfSorting = timeOfSorting;
    }

    @Override
    public int [] sort (int  arr[])    {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
                for (int z = i - 1; (z - 1) >= 0; z--) {
                    if (arr[z] < arr[z - 1]) {
                        int temp2 = arr[z];
                        arr[z] = arr[z-1];
                        arr[z-1] = temp2;
                    } else {
                        break;
                    }
                }
            }
        }
        return arr;
    }
}
