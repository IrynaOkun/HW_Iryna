package Lessons;

import java.util.ArrayList;
import java.util.List;

public class Lesson13_List {

    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        System.out.println(strList);
        strList.add(0, "m");
        System.out.println(strList);

        strList.remove("m");
        System.out.println(strList);

        strList.remove(0);
        System.out.println(strList);

        //strList.(очень много методов)

        //String str = new String();
        //String[] array = new String[10];

        //List<String> str;
        //List<Integer> numbers;
        //List<Double> doubleNums;

        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        System.out.println(intList.isEmpty());

        System.out.println(strList);
        System.out.println(intList);

        System.out.println(intList.size());

        System.out.println(strList.add("c"));
        System.out.println(strList);

        System.out.println(strList.remove("c"));
        System.out.println(strList);

    }

}
