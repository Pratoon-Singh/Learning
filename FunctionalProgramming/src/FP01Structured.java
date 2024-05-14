import java.util.List;

public class FP01Structured {
	// print all numbers in list
	public static void main(String[] args) {
//	printAllnumbersInListStructured(List.of(12,34,65,67,12));
	printEvenNumbersInListStructured(List.of(12,34,65,67,12));
	}


	private static void printAllnumbersInListStructured(List<Integer> numbers) {

		// How to loop the numbers?
		for(Integer number:numbers){
			System.out.println(number);
		}
	}
	private static void printEvenNumbersInListStructured(List<Integer> numbers) {

		// How to loop the numbers?
		for(Integer number:numbers){
			if(number%2==0){
			System.out.println(number);
			}
		}
	}
}