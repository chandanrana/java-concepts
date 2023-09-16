package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 4, 6, 3, 6, 9);

        long count = intList.stream().count();
        int first = intList.stream().findFirst().get();
        System.out.println(Arrays.toString(intList.toArray()));
    }
    private static List<Integer> even(List<Integer> list) {
        return list.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
//                return integer % 2 == 0;
                return integer.toString().startsWith("1");
            }
        }).collect(Collectors.toList());
    }
}
