package itc.cse.search.sort;

import java.util.Arrays;

import static itc.cse.lamda.basic.MyFunction.A;

public class MySort {
    public static void main(String[] args) {

        int [] arr = {72, 60, 83, 47, 89, 95};
        Arrays.stream(arr).forEach(x -> System.out.print(x + "\t"));
        System.out.println();

        int[] sortedArr = selectionSort(arr);
        Arrays.stream(arr).forEach(x -> System.out.print(x + "\t"));

//        for (int i = 0; i < sortedArr.length; i++) {
//            System.out.println(sortedArr[i]);
//        }
    }



    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        return arr;
    }
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int insertElement = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > insertElement) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = insertElement;
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if(low < high){


        }
    }
}
