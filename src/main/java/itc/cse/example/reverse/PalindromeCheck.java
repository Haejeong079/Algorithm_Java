package itc.cse.example.reverse;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String s = scanner.nextLine();

        String stringBuffer = new StringBuffer(s).reverse().toString();

        if (s.equals(stringBuffer)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

        scanner.close();
    }
}
