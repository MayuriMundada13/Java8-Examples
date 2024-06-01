package basic.practices.numbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElement {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(5);
        integerList.add(5);
        integerList.add(13);
        integerList.add(13);

        Set<Integer> newSet = new HashSet<>();

        List<Integer> collect = integerList.stream()
                .filter(number -> !newSet.add(number))
                .collect(Collectors.toList());

        System.out.println("Duplicate element = " + collect);
    }
}
