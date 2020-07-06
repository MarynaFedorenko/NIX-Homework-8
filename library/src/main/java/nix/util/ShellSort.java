package nix.util;

import nix.util.abstr.Sorting;

public class ShellSort implements Sorting {
    private static long timeOfSorting = 0 ;

    public static long getTimeOfSorting() {
        return timeOfSorting;
    }

    public static void setTimeOfSorting(long timeOfSorting) {
        ShellSort.timeOfSorting = timeOfSorting;
    }

    @Override
    public int[] sort(int[] arr) {
        int half = arr.length / 2;
        while (half >= 1) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i - half; j >= 0; j -= half) {
                    if (arr[j] > arr[j + half]) {
                        int temp = arr[j];
                        arr[j] = arr[j+half];
                        arr[j+half] = temp;
                    }
                }
            }
            half = half / 2;
        }
        return arr;
    }
}
