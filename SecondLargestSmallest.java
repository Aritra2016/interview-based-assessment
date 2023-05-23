package Ques_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;  


public class SecondLargestSmallest {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);

        // Read the integers from the user
        System.out.print("Enter the number of integers: ");
        int count = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter the integers:");
        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        // Find the second largest and second smallest elements
        int secondLargest = findSecondLargest(numbers);
        int secondSmallest = findSecondSmallest(numbers);

        // Print the results
        System.out.println("Second largest: " + secondLargest);
        System.out.println("Second smallest: " + secondSmallest);
    }

    private static int findSecondLargest(List<Integer> numbers) {
        Collections.sort(numbers);
        int size = numbers.size();
        if (size >= 2) {
            return numbers.get(size - 2);
        } else {
            throw new IllegalArgumentException("List must contain at least 2 elements.");
        }
    }

    private static int findSecondSmallest(List<Integer> numbers) {
        Collections.sort(numbers);
        int size = numbers.size();
        if (size >= 2) {
            return numbers.get(1);
        } else {
            throw new IllegalArgumentException("List must contain at least 2 elements.");
        }
		
	}
}
