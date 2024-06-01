package basic.practices.numbers;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        /* way 1
        List<Integer> collect = list.stream().filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even number : " + collect);
         */

        list.stream().filter(number -> number % 2 == 0)
                     .forEach(System.out::println);
    }
}
