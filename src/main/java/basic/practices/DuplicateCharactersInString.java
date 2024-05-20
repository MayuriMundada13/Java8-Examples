package basic.practices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateCharactersInString {

    public static void main(String[] args) {
        String word = "rohttoh";
        List<String> collect = Arrays.stream(word.split(""))
                .filter(str -> word.indexOf(str) != word.lastIndexOf(str))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect);

    }
}
