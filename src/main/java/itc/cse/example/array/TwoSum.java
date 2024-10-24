package itc.cse.example.array;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("배열 크기를 입력 하세요 : " );
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.print("배열 정수를 입력하세요 : ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }



    }
}
