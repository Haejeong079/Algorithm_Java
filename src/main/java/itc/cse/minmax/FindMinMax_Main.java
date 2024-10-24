package itc.cse.minmax;

import itc.cse.search.max.FindMax;

public class FindMinMax_Main {
    public static void main(String[] args) {
        FindMinMax fmm = new FindMinMax();
        int[] A = {24, 75, 92, 83, 61, 48, 97, 50};
        int[] results = new int[2];
        results = fmm.findMinMax(A, 0, A.length-1);
    }
}


