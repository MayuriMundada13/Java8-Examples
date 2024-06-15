package basic.java8.characters;

import java.util.Arrays;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        String word = "rohttoh";
        String s = Arrays.stream(word.split(""))
                .filter(str -> word.indexOf(str) != word.lastIndexOf(str))
                .findFirst().get();
        System.out.println("Find first repeated character = " + s);
    }
}
