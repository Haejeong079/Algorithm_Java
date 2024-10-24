package itc.cse.search.sum;

public class SumMain {
    public static void main(String[] args) {
        CumeSum cumeSum = new CumeSum();

        int [] FREQ = {1, 0, 7, 5, 4, 3};

        for (int i = 0; i<FREQ.length; i++) {
            System.out.printf("%3d", FREQ[i]);
        }

        System.out.println();

        int [] CUME = cumeSum.calcCume(FREQ);
        // calcCume()


        for (int i = 0; i<CUME.length; i++) {
            System.out.printf("%3d", CUME[i]);
        }
    }
}
