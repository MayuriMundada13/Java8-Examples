package org.practices;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(5);
        integerList.add(1);
        integerList.add(50);
        integerList.add(5);
        integerList.add(13);

        Set<Integer> newSet = new HashSet<>();
        List<Integer> collect = integerList.stream()
                                           .filter(newSet::add)
                                           .collect(Collectors.toList());

        System.out.println("Remove duplicate element = " + collect);
    }
}
