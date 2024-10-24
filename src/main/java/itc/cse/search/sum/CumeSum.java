package itc.cse.search.sum;

public class CumeSum {
    public static void main(String[] args) {
        CumeSum cumeSum = new CumeSum();

        int [] FREQ = {1, 0, 7, 5, 4, 3};

        for (int i = 0; i<FREQ.length; i++) {
            System.out.print(FREQ[i] + " ");
        }

        System.out.println();

        int [] CUME = cumeSum.calcCume(FREQ);
        // calcCume()


        for (int i = 0; i<CUME.length; i++) {
            System.out.print(CUME[i] + " ");
        }
    }

    public static int[] calcCume(int[] freq) {
        int[] CUME = new int[freq.length];
        CUME[0] = freq[0];
        for (int i = 1; i < freq.length; i++) {
            CUME[i] = CUME[i-1] + freq[i];
        }

        return CUME;
    }

}
