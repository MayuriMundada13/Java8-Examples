package basic.java8.numbers;

import java.util.Arrays;
import java.util.List;

public class DuplicateNumber {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

        list.stream()
                .filter(n -> list.indexOf(n) != list.lastIndexOf(n))
                .distinct()
                .forEach(System.out::println);
    }
}
