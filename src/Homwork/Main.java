package Homwork;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Set<Integer> result = new TreeSet<>();
        for (Integer namber : intList) {
            if (namber % 2 == 0 && namber > 0) {

                result.add(namber);
            }
        }
        for (Integer n : result) {
            System.out.println(n);

        }
        System.out.println();
        streamMain();
    }


    public static void streamMain() {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        intList.stream().filter(x -> x > 0).filter(x -> x % 2 == 0).sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }
}
