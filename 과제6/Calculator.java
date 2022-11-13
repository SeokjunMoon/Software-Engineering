package Refactoring;
import java.util.List;
import static Refactoring.IntegerList.*;
import static Refactoring.Product.*;
import static Refactoring.Sum.*;

public class Calculator {
    public static void main(String[] args) {
        printInputMessage();
        List<Integer> integerList = getIntegerList();
        closeInput();

        long sum = getSum(integerList);
        long product = getProduct(integerList);

        printResult(sum, product);
    }

    public static void printResult(long sum, long product) {
        printSum(sum);
        printProduct(product);
    }
}