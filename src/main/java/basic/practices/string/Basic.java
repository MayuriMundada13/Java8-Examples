package basic.practices.string;

import java.util.ArrayList;
import java.util.List;

//convert array list in stream using collect & forEach

public class Basic {

    public static List<String> convertArrayListInStream() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Mayuri");
        stringList.add("Gauri");
        stringList.add("Radhika");
        stringList.add("Pooja");
        stringList.add("Mundada");

        //display string that start with m
        /*
        return stringList.stream()
                .filter(m -> m.toLowerCase().startsWith("m"))
                .collect(Collectors.toList());
         */
        List<String> list = new ArrayList<>();
        stringList.stream()
                .filter(m -> m.toLowerCase().startsWith("m"))
                .forEach(list::add);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(convertArrayListInStream());
    }
}
