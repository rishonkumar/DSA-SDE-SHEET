package JavaPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeJavaEight {

    public static void main(String[] args) {

        //to print all the even number from a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        List<Integer>evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        //Convert list of string to uppercase
        List<String> words = Arrays.asList("hello", "world", "java", "8");
        words.stream().map(String::toUpperCase).forEach(System.out::println);

        //Find the sum of all numbers in a list
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers1.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        //Count the number of strings in a list that start with the letter "J"
        long count = words.stream().filter(s -> s.startsWith("j")).count();
        System.out.println(count);

        //Sort a list of strings in alphabetical order using
        words.stream().sorted().forEach(System.out::println);

        //find the maximum number in a list
        //        numbers.stream() – Creates a stream of Integer objects.
        //.mapToInt(Integer::intValue) – Converts each Integer (wrapper class) into a primitive int.
        //                Why do we need this?
        //                Streams have two types:
        //
        //        Stream<Integer> → Stream of Integer objects (wrapper class).
        //        IntStream → Stream of primitive int values.
        numbers.stream().mapToInt(Integer::intValue).max().orElse(0);
        numbers.stream().max(Integer::compareTo).orElse(0);

        //Remove duplicate elements from a list
        numbers.stream().distinct().collect(Collectors.toList());

        //Check if all numbers in a list are greater than 0
        numbers.stream().allMatch(n -> n > 0);

        //Concatenate all strings in a list
        String res = words.stream().collect(Collectors.joining(", "));
        System.out.println(res);

        //Group a list of strings by their length
        List<String> words2 = Arrays.asList("apple", "banana", "cherry", "date");

        Map<Integer,List<String>>groupedBylength = words2.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groupedBylength);

        //Convert a list of strings to a map where the key is the string and the value is its length
        Map<String,Integer>wordLengthMap = words2.stream().collect(Collectors.toMap(Function.identity(),String::length));
        System.out.println(wordLengthMap);

        //Find the longest string in a list
        //Comparators are useful whenever you need to compare objects based on a specific property.
        words2.stream().max(Comparator.comparingInt(String::length)).orElse("");

        //Merge two lists and remove duplicates
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 4, 5);

        List<Integer>merged = Stream.concat(list1.stream(),list2.stream()).distinct().collect(Collectors.toList());
        System.out.println(merged);

    }
}
