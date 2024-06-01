package basic.practices.numbers;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWithOne {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

        //way 1
        list.stream()
                .filter(number -> String.valueOf(number).startsWith("1"))
                .forEach(System.out::println);

        //way 2
        list.stream()
                .map(s -> s + "") //converting integer to string
                .filter(s -> s.startsWith("1"))
                .forEach(System.out::println);
    }
}
