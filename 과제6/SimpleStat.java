import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleStat {
	public static void main(String[] args) {
		Scanner scanner = startScanner();
		List<Integer> integer_list = getIntegerListFromScanner(scanner);
		scanner.close();

		long sum = getSum(integer_list);
		long product = getProduct(integer_list);

		printResult(sum, product);
	}

	public static Scanner startScanner() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter integer ( 0 or minus for Exit)");

		return scanner;
	}

	public static List<Integer> getIntegerListFromScanner(Scanner scanner) {
		List<Integer> integer_list = new ArrayList<>();
		while (true) {
			int input_number = scanner.nextInt();
			Boolean isNegative = input_number <= 0;
			if (isNegative)
				break;
			integer_list.add(input_number);
		}

		return integer_list;
	}

	public static long getSum(List<Integer> integer_list) {
		long sum = 0;
		for (int i : integer_list) {
			sum += i;
		}

		return sum;
	}

	public static long getProduct(List<Integer> integer_list) {
		long product = 1;
		for (int i : integer_list) {
			product *= i;
		}

		return product;
	}

	public static void printResult(long sum, long product) {
		printSum(sum);
		printProduct(product);
	}

	public static void printSum(long sum) {
		System.out.println("Sum: " + sum);
	}

	public static void printProduct(long product) {
		System.out.println("Product: " + product);
	}
}

