package org.practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SmallestNumber {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(12);
        integerList.add(2);
        integerList.add(0);
        integerList.add(50);

        Optional<Integer> min = integerList.stream().min(Integer::compareTo);
        System.out.println("Smallest number = " + min.get());
    }
}
