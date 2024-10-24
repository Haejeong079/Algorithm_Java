package itc.cse.search.binary;

public class MySearch {
    public static void main(String[] args) {
        int [] arr={11,22,33,44,55,66,77};
        int x=55;
        //이진 탐색으로 특정한 값의 위치를 찾으세요.
        int position=binarySearch(arr,0,arr.length-1,x);
        System.out.println("위치는 : "+position);


    }

    public static int binarySearch(int[] arr, int start, int end,int x) {
        if (start > end) {
            return -1;   //실패
        } else {
            int mid = (start + end) / 2;
            if (x == arr[mid]) {
                return mid;
            } else if (x < arr[mid]) {
                return binarySearch(arr, start, mid - 1, x);
            } else {
                return binarySearch(arr, mid + 1, end, x);
            }
        }
    }

    public static int findMaximum(int[]arr){
        int max=arr[0];
        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        return max;
    }
}
