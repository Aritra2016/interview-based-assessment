package Ques_06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample {
    public static void main(String[] args) {
        // Create a large dataset
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 1000000; i++) {
            numbers.add(i);
        }

        // Perform sorting using Stream API
        List<Integer> sortedNumbers = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Sorted numbers:");
        sortedNumbers.forEach(System.out::println);

        // Perform filtering using Stream API
        List<Integer> filteredNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Filtered numbers (even):");
        filteredNumbers.forEach(System.out::println);
    }
}

