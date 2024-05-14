package exercise;

import java.util.List;

public class Exercise01 {
	// Print only odd numbers from the list
	public static void main(String[] args) {
		printOddNumberInList(List.of(13,44,567,341,67,113,12,8));
	}

	private static void printOddNumberInList(List<Integer> numbers) {
		numbers.stream()
				.filter(number->number%2!=0)
				.forEach(System.out::println);
	}
}
