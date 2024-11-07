package itc.cse.dp;

public class FloydPath {
    public static final int INF = 999;
    public static void main(String[] args) {
        int[][] graph = {
                {0, INF, 2, INF},
                {1, 0, INF, INF},
                {INF, 8, 0, 3},
                {6, 4, INF, 0}
        };


        int[][] shortestPath = allPairShortestPath(graph);
        printArray(shortestPath);

    }

    private static void printArray(int[][] shortestPath) {
        for (int[] ints : shortestPath) {
            for (int a : ints) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }

    private static int[][] allPairShortestPath(int[][] W) {
        int size = W.length;
        int[][] D = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < W[0].length; j++) {
                D[i][j] = W[i][j];
            }
        }

        for (int k = 0; k < size; k++) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    D[i][j] = Math.min(D[i][j], D[i][k] + W[k][j]);
                }
            }
            System.out.println("사용정점 k : " + k);
            printArray(D);
            System.out.println(" ");
        }

        return D;
    }
}
