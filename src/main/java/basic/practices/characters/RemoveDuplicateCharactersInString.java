package basic.practices.characters;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateCharactersInString {
    public static void main(String[] args) {
        String word = "rohttoh";

        //way 1 - using set
        Set<String> characterSet = new HashSet<>();
        List<String> collect1 = Arrays.stream(word.split(""))
                .filter(characterSet::add)
                .collect(Collectors.toList());

        //way 2 without using set

        System.out.println(" Remove duplicate characters in string = " + collect1);
    }
}
