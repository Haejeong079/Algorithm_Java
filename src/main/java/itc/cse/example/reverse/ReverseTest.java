package itc.cse.example.reverse;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("아무거나 입력하세요 : ");

        String s = scanner.nextLine();

        StringBuffer stringBuffer = new StringBuffer(s);

        String Reversed = stringBuffer.reverse().toString();
        System.out.println("뒤집은 문자열 : " + Reversed);



        scanner.close();


    }
}
