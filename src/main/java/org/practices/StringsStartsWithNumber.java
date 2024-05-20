package org.practices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsStartsWithNumber {
    public static void main(String[] args) {
        String [] words= {"mayuri","foo","nemo","target1","12Target","2robot"};

        List<String> collect = Arrays.stream(words)
                .filter(name -> Character.isDigit(name.charAt(0)))
                .collect(Collectors.toList());

        System.out.println("Strings starts with number = " + collect);
    }
}
