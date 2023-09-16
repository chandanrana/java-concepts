package java8;

import java.util.*;
import java.util.stream.Collectors;

public class Duplicate {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A","B", "C", "A", "B", "D", "E", "C" );

        System.out.println("Get java_8_practice.Duplicate Elements: ");
        System.out.print(Arrays.toString(getDuplicates(stringList).toArray()));

        System.out.println();
        System.out.println("Remove java_8_practice.Duplicate Elements: ");
        System.out.println(Arrays.toString(removeDuplicates(stringList).toArray()));

        System.out.println();
        System.out.println("Sort Elements: ");
        System.out.println(Arrays.toString(sortElements(stringList).toArray()));

        System.out.println();
        System.out.println("Sort Elements in Desc Order: ");
        System.out.println(Arrays.toString(sortElementsInDesc(stringList).toArray()));

        List<Integer> intList = Arrays.asList(6, 7, 9, 1, 3, 5, 6, 3);
        System.out.println();
        System.out.println("find max : "+getMaxValue(intList)+" Min: "+getMinValue(intList));

    }

    // Returns the duplicate elements from the array
    private static List<String> getDuplicates(List<String> strList){
        return strList.stream().filter(str -> Collections.frequency(strList, str) > 1).distinct().collect(Collectors.toList());
    }

    // Removes the duplicate elements from the array
    private static List<String> removeDuplicates(List<String> strList){
        return strList.stream().distinct().collect(Collectors.toList());
    }

    // Sort in asc order
    private static List<String> sortElements(List<String> stringList){
        return stringList.stream().sorted().collect(Collectors.toList());
    }

    // Sort in desc order
    private static List<String> sortElementsInDesc(List<String> stringList){
        return stringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

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

}