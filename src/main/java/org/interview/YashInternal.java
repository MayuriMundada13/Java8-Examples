package org.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//asking this example in Yash internal evaluation interview

public class YashInternal {
    public static List<Integer> getNumber() {
        final List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(16);
        integerList.add(5);
        integerList.add(7);
        integerList.add(6);

        return integerList.stream()
                 .filter(number -> String.valueOf(number).startsWith("1"))
                 .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Number = " + getNumber());
    }
}
