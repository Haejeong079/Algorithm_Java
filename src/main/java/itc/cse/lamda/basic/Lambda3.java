package itc.cse.lamda.basic;

import java.util.*;

public class Lambda3 {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("CC", "AA", "DD", "BB");
        List<Integer> intList = Arrays.asList(5, 3, 1, 4, 2);
        System.out.println(strList);

        Collections.sort(strList, (o1, o2) -> -o2.compareTo(o1));

        System.out.println(strList);
    }
}
