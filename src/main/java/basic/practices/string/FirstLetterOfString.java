package basic.practices.string;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FirstLetterOfString {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Mayuri");
        stringList.add("Mundada");
        stringList.add("Pooja");
        stringList.add("Java");

        List<String> collect = stringList.stream()
                .map(name -> name.substring(0, 1))
                .collect(Collectors.toList());

        System.out.println("First letter of string = " + collect);
    }
}
