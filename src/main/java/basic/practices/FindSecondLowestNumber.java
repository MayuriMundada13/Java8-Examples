package basic.practices;

import java.util.Arrays;

public class FindSecondLowestNumber {
    public static void main(String[] args) {
        int a[] = {3, 6, 32, 1, 8, 5, 31, 22, 2};
        int second = Arrays.stream(a).distinct().sorted().skip(1).findFirst().getAsInt();
        System.out.println("Find second lowest number = " + second);
    }
}
