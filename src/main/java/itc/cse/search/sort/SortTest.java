package itc.cse.search.sort;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        int[] arr = {72, 60, 83, 47, 89, 95};
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
        System.out.println();

        MySort.insertionSort(arr);
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
        System.out.println();

    }
}

