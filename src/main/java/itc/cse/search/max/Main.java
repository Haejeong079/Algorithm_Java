package itc.cse.search.max;

import itc.cse.search.binary.MySearch;
import itc.cse.search.sort.MySort;
import itc.cse.search.sum.CumeSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr={72, 60, 83, 47, 89, 95};

        int max = MySearch.findMaximum(arr);//쵀댓값 찾기
        System.out.println(max);

        int[] CUME = CumeSum.calcCume(arr);
        for (int i = 0; i<CUME.length; i++) {
            System.out.printf("%4d", CUME[i]);
        }
        System.out.println();

        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
        System.out.println();

        int[] sorted = MySort.selectionSort(arr);
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
        System.out.println();

        int pos = MySearch.binarySearch(sorted, 0, sorted.length - 1, 89);
        System.out.println("검출 위치는 : " + pos);
    }
}
