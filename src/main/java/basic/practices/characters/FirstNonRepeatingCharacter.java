package basic.practices.characters;

import java.util.Arrays;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String word = "rohttoh";

        String s = Arrays.stream(word.split(""))
                .filter(name -> word.indexOf(name) == word.lastIndexOf(name))
                .findFirst()
                .get();
        System.out.println("Find first not repeated character = " + s);
    }
}
