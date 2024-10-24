package itc.cse.dmq.quicksort;

public class Main {
    public static void main(String[] args) {
        QuickSort qs = new QuickSort();

        int [] arr = {15,22,13,27,12,10,20,25};
        qs.quickSort(arr, 0, arr.length-1);

    }
}
