package basic.practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class LargestElement {
    public static void main(String[] args) {
        //way 1
        /*
        Stream<Integer> integerStream = Stream.of(1, 2, 34, 6);
        Optional<Integer> max = integerStream.max(Integer::compareTo);
        */

        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(10);
        integerList.add(50);
        integerList.add(8);

        Optional<Integer> max = integerList.stream().max(Integer::compareTo);
        System.out.println("Largest Number = " + max.get());
    }
}
