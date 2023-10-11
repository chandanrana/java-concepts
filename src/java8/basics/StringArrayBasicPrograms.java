package java8.basics;

import java.util.*;
import java.util.stream.Collectors;

public class BasicProgramsOnStringArray {

    // Get all the duplicate strings from the array
    private static List<String> getDuplicates(List<String> strList){
        return strList.stream().filter(str -> Collections.frequency(strList, str) > 1).distinct().collect(Collectors.toList());
    }

    // Remove all duplicate strings from the array
    private static List<String> removeDuplicates(List<String> strList){
        return strList.stream().distinct().collect(Collectors.toList());
    }

    // Sort strings in ascending order
    private static List<String> sortElements(List<String> stringList){
        return stringList.stream().sorted().collect(Collectors.toList());
    }

    // Sort strings in descending order
    private static List<String> sortElementsInDesc(List<String> stringList){
        return stringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

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
    }
}