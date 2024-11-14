package itc.cse.greedy;

import java.util.ArrayList;
import java.util.List;

public class PrimeMST {
    public static final int INF = 999;


    public void mst(int[][] W) {
        int n = W.length;
        int[] near = new int[n];
        boolean[] isBlue = new boolean[n];

        isBlue[0] = false;  // 적색

        for (int i = 1; i < n; i++) {
            isBlue[i] = true;
            near[i] = 0;
        }

        int newRed = 0;

        for (int i = 1; i < n; i++) {
            int minVal = INF;
            for (int b = 0; b < n; b++) {
                if(isBlue[b] && W[b][near[b]] < minVal) {
                    minVal = W[b][near[b]];
                    newRed = b;
                }
            }
            isBlue[newRed] = false;
            System.out.println((char)(near[newRed] + 'a') + " - " + (char)(newRed + 'a') + " : " + minVal);

            for (int b = 0; b < n; b++) {
                if(isBlue[b] && W[b][newRed] < W[b][near[b]]){
                    near[b] = newRed;
                }
            }
        }
    }

    public static void main(String[] args) {

        PrimeMST pm = new PrimeMST();

        int[][] G = {
                {0, 2, INF, INF, 4},
                {2, 0, 8, INF, 4},
                {INF, 8, 0, 7, 6},
                {INF, INF, 7, 0, 3},
                {4, 4, 6, 3, 0}
        };

        pm.mst(G);

        Edge e1 = new Edge();
        e1.setV1(1);
        e1.setV2(2);
        e1.setWeight(5);

        List<Edge> edgeList = new ArrayList<>();

        edgeList.add(e1);

        for(Edge edge : edgeList){
            edge.getWeight();
        }

    }
}
