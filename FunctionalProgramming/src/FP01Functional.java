import java.util.List;

public class FP01Functional {
	public static void main(String[] args) {
//		printAllnumbersInListFunctional(List.of(12,34,65,67,12));
//		printEvenNumbersInListFunctional(List.of(12,34,65,67,12));
		mapInStream(List.of(2,5));
	}

//	private static void printNumber(int number){
//		System.out.println(number);
//	}
	private static void printAllnumbersInListFunctional(List<Integer> numbers) {
		// What to do?
		numbers.stream()
//				.forEach(FP01Functional::printNumber);// Method Reference
		.forEach(System.out::println);
	}

	private static boolean isEven(int number){
		return number%2==0;
	}
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		// What to do?
		numbers.stream()
				//.filter(FP01Functional::isEven)
				.filter((number)->number%2==0) //Using Lambda Expression
				.forEach(System.out::println);
	}

	private static  void mapInStream(List<Integer> numbers){
		numbers.stream()
				.map(number ->number*number)
				.forEach(System.out::println);
	}
}
