package Refactoring;
import java.util.List;

public class Sum {
    static long sum = 0;

    static long getSum(List<Integer> integer_list){
        for (int number : integer_list) {
            sum += number;
        }
        return sum;
    }

    static void printSum(long sum){
        System.out.println("Sum: " + sum);
    }
}