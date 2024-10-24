package itc.cse.search.max;

public class FindMax {
    public static void main(String[] args) {
        int [] arr = {72, 60, 83, 47, 89, 95};
/*        int max = arr[0]; //최댓값 찾는 함수.

        int maxPos = 0;
        for(int i=0; i< arr.length; i++){

            if(max < arr[i]){
                max = arr[i];
                maxPos = i+1;

            }
        }
        System.out.println("가장 큰값은 "+ max + " 이며 위치는 " + maxPos + " 입니다.");*/

        FindMax findMax = new FindMax();
        int max = findMax.findMaximum(arr);
        System.out.println("최대값 : " + max);


    }

    public static int findMaximum(int[] arr) {
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < max){
                max = arr[i];
            }
        }

        return max;
    }

}
