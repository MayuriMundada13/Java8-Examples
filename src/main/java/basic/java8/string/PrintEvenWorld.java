package basic.java8.string;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEvenWorld {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Mayuri");
        stringList.add("Mundada");
        stringList.add("Gauri");
        stringList.add("Java");

        List<String> collect = stringList.stream()
                .filter(name -> name.length() % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Print even number string = " + collect);
    }
}
