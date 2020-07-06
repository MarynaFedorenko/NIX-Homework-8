package nix;

import nix.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class DataTest {
    private static Random random;
    final static  int[] arr = new int [20];


    private void build() {
        random = new Random();
        System.out.print("Unsorted array: ");
        for(int i=0; i<arr.length; i++){
         arr[i] = random.nextInt(1000);
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }

    @Test
    public void checkBubbleSorting(){
        build();
        List<Integer> list = new ArrayList<Integer>(arr.length);
        for(int i : arr) list.add(i);
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        Collections.sort(list);
        System.out.print("Sorted array(Bubble Sort): ");
        for (int i = 0; i < arr.length; i++) {
            assertEquals(list.get(i), arr[i]);
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    @Test
    public void checkInsertionSorting(){
        build();
        List<Integer> list = new ArrayList<Integer>(arr.length);
        for(int i : arr) list.add(i);
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);
        Collections.sort(list);
        System.out.print("Sorted array(Insertion Sort): ");
        for (int i = 0; i < arr.length; i++) {
            assertEquals(list.get(i), arr[i]);
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    @Test
    public void checkMergeSorting(){
        build();
        List<Integer> list = new ArrayList<Integer>(arr.length);
        for(int i : arr) list.add(i);
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr);
        Collections.sort(list);
        System.out.print("Sorted array(Merge Sort): ");
        for (int i = 0; i < arr.length; i++) {
            assertEquals(list.get(i), arr[i]);
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }

    @Test
    public void checkQuickSorting(){
        build();
        List<Integer> list = new ArrayList<Integer>(arr.length);
        for(int i : arr) list.add(i);
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr);
        Collections.sort(list);
        System.out.print("Sorted array(Quick Sort): ");
        for (int i = 0; i < arr.length; i++) {
            assertEquals(list.get(i), arr[i]);
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }

    @Test
    public void checkSelectionSorting(){
        build();
        List<Integer> list = new ArrayList<Integer>(arr.length);
        for(int i : arr) list.add(i);
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(arr);
        Collections.sort(list);
        System.out.print("Sorted array(Selection Sort): ");
        for (int i = 0; i < arr.length; i++) {
            assertEquals(list.get(i), arr[i]);
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    @Test
    public void checkShellSorting(){
        build();
        List<Integer> list = new ArrayList<Integer>(arr.length);
        for(int i : arr) list.add(i);
        ShellSort shellSort = new ShellSort();
        shellSort.sort(arr);
        Collections.sort(list);
        System.out.print("Sorted array(Shell Sort): ");
        for (int i = 0; i < arr.length; i++) {
            assertEquals(list.get(i), arr[i]);
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    @Test
    public void checkShuttleSorting(){
        build();
        List<Integer> list = new ArrayList<Integer>(arr.length);
        for(int i : arr) list.add(i);
        ShuttleSort shuttleSort = new ShuttleSort();
        shuttleSort.sort(arr);
        Collections.sort(list);
        System.out.print("Sorted array(Shuttle Sort): ");
        for (int i = 0; i < arr.length; i++) {
            assertEquals(list.get(i), arr[i]);
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
}
