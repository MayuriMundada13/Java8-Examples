package basic.normal;

import java.util.Arrays;
import java.util.List;

public class DuplicateNumber {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

        for (int i = 0; i < list.size(); i++) {
            Integer currentNumber = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                if (currentNumber.equals(list.get(j))) {
                    System.out.print(currentNumber + " ");
                }
            }
        }
    }
}