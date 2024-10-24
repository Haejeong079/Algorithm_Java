package itc.cse.minmax;

public class FindMinMax {

    public int[] findMinMax(int[] A, int i, int j) {
        int[] results = new int[2];
        int[] leftResult = new int[2];
        int[] rightResult = new int[2];

        if (i == j) {
            results[0] = A[i];  //min
            results[1] = A[i];  //max
        } else if (i == j - 1) {
            if (A[i] < A[j]) {
                results[0] = A[i];
                results[1] = A[j];
            } else {
                results[0] = A[j];
                results[1] = A[i];
            }
        } else {
            int mid = (i + j) / 2;      //중간 위치
            leftResult = findMinMax(A, i, mid);
            System.out.printf("min: %d , max: %d , 시작: %d, 끝: %d \n", leftResult[0], leftResult[1], i, mid);

            rightResult = findMinMax(A, mid + 1, j);
            System.out.printf("min: %d , max: %d , 시작: %d, 끝: %d \n", rightResult[0], rightResult[1], mid+1, j);

            //최솟값 구하기
            if (leftResult[0] < rightResult[0]) results[0] = leftResult[0];
            else results[0] = rightResult[0];

            //최댓값 구하기
            if (leftResult[1] < rightResult[1]) results[1] = rightResult[1];
            else results[1] = leftResult[1];
        }

        return results;
    }

}



