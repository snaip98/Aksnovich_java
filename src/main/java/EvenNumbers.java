package main.java;

import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

    public static final List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    public static void main(String[] args) {
        getEvenNumbers(numbers).forEach(System.out::println);
    }

    public static List<Integer> getEvenNumbers(List<Integer> numbers) {
        return numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
    }
}
