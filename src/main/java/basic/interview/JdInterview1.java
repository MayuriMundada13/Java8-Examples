package basic.interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JdInterview1 {
    public static void main(String[] args) {
        String input = "en_lawn_tractors";
        String[] s = input.split("_");

        String collect = Arrays.stream(s)
                .skip(1)
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .collect(Collectors.joining(" "));

        System.out.println("Output = " + collect);
    }
}
