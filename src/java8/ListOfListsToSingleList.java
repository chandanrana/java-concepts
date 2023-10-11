package java8;

import java8.defaultmethods.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Q. Convert list of multiple list into linear list using java 8
 */
public class ConvertList {

    public static void main(String[] args) {
        List<List<Integer>> multiList = new ArrayList<>();
        multiList.add(Arrays.asList(1, 2, 3, 4, 5));
        multiList.add(Arrays.asList(6, 7, 8));
        multiList.add(Arrays.asList(9, 0, 10, 11));

        List<Integer> collect = multiList.stream()
                .flatMap(new Function<List<Integer>, Stream<Integer>>() {
                    @Override
                    public Stream<Integer> apply(List<Integer> integerList) {
                        return integerList.stream();
                    }
                })
                .toList();

        System.out.println(collect);
    }
}
