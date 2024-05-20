package basic.interview;

import java.util.*;
import java.util.stream.Collectors;

public class JdInterview3 {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1, 9, 4, 1, 4, 7, 1);

        Set<Integer> integerSet1 = new HashSet<>();
        List<Integer> collect1 = al.stream().filter(integerSet1::add).collect(Collectors.toList());
        System.out.println("Remove duplicate element using HashSet = " + collect1);
    }
}
