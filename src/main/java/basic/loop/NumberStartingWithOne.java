package basic.loop;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWithOne {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

        for (Integer l : list) {
          if(l.toString().startsWith("1")) {
              System.out.print(l + " ");
          }
        }
    }
}
