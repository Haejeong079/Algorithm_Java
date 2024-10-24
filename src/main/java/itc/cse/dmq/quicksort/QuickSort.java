package itc.cse.dmq.quicksort;

public class QuickSort {


    public void quickSort(int[] A, int low, int high) {
        if(low < high) {
            int s = partition(A, low, high);

            System.out.println("피벗 인덱스 : " + s + ", 피벗 값 : " + A[s]);
            for (int i : A) {
                System.out.print(i + "\t");
            }
            System.out.println("\n");

            quickSort(A, low, s-1);     // 왼쪽에 대한 정렬
            quickSort(A, s+1, high);    // 오른쪽에 대한 정렬

        }
    }



    private int partition(int[] A, int low, int high){
        int i = low + 1;
        int j = high;

        while(i <= j){
            if(A[i] < A[low]){
                i++;
            } else if (A[j] > A[low]) {
                j--;
            }else {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j--;
            }
        }
        int t = A[low];
        A[low] = A[j];
        A[j] =t;

        //피벗의 위치 인덱스
        return j;

    }
}
