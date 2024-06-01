package basic.practices.numbers;

import java.util.ArrayList;
import java.util.List;

public class SearchElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(9);

        boolean present = list.stream().anyMatch(number -> number.equals(7));
        System.out.println("Output = " + present);
    }
}
