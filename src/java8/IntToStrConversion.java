package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntToStrConversion {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 3, 5, 6, 3, 7, 9, 10);
        System.out.println(Arrays.toString(convert(integerList).toArray()));
    }

    private static List<String> convert(List<Integer> integerList) {
        return integerList.stream().map(value-> value+"k").collect(Collectors.toList());
    }
}