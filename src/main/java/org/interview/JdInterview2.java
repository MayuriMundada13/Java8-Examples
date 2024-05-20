package org.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JdInterview2 {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Mayuri");
        stringList.add("mundada");
        stringList.add("Gauri");
        stringList.add("radhika");

        List<String> collect = stringList.stream()
                .filter(name -> name.charAt(0) >= 'A' && name.charAt(0) <= 'Z')
                .collect(Collectors.toList());

        System.out.println("Output = " + collect);
    }
}
