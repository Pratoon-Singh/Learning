package exercise;

import java.util.List;

public class Exercise05 {
	/*
	Print the cubes of odd numbers
	 */
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,5,6,7);
		numbers.stream()
				.filter(number ->number%2!=0)
				.map(number->number*number*number)
				.forEach(System.out::println);
	}
}
