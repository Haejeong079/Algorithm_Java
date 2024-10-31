package itc.cse.dp;

public class CutRod {
    public int cutRod_DP(int[] p, int n) {
        int[] maxSell = new int[n +1];
        maxSell[0] = 0;
        for (int i = 1; i <= n; i++) {
            int maxVal = 0;
            for (int j = 1; j <= i; j++) {
                maxVal = Math.max(maxVal, p[j-1] + maxSell[i-j]);
            }
            maxSell[i] = maxVal;
        }
        return maxSell[n];
    }
    public int cutRod_DC(int[] p, int i) {
        if(i == 0){
            return 0;
        } else{
            int maxSell = 0;

            for (int j = 1; j <= i; j++){
                maxSell = Math.max(maxSell, p[j-1] + cutRod_DC(p, i-j));
            }
            return maxSell;
        }
    }

    public static void main(String[] args) {
        CutRod cr = new CutRod();
        int[] p = {2, 5, 9, 10};
        int n = p.length;

        int dc_max = cr.cutRod_DC(p, n);
        System.out.println("최대 판매 금액 : " + dc_max);

        int dp_max = cr.cutRod_DP(p, n);
        System.out.println("최대 판매 금액 : " + dp_max);
    }
}

