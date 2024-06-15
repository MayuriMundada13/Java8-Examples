package basic.loop;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

        System.out.println("Even number");
        /* way 1 */
        for (Integer l : list) {
            if (l % 2 == 0) {
                System.out.print(l + " ");
            }
        }

        /* way 2 */
        int i = 0;
        while (i < list.size()) {
            if(list.get(i) % 2 == 0) {
                System.out.print(list.get(i) + " ");
            }
            i++;
        }
    }
}
