package java8.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BasicProgramsOnIntegerArray {

    private static int getMinValue(List<Integer> intList){
        return intList.stream().min(Comparator.comparing(Integer::valueOf)).get();
    }

    private static int getMaxValue(List<Integer> intList){
        return intList.stream().max(Comparator.comparing(Integer::valueOf)).get();
    }

    // get count of those string whose length is greater than 3
    private static long getCount(List<String> strList) {
        return strList.stream().filter(str -> str.length() > 3).count();
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(6, 7, 9, 1, 3, 5, 6, 3);
        System.out.println();
        System.out.println("find max : "+getMaxValue(intList)+" Min: "+getMinValue(intList));

    }

}