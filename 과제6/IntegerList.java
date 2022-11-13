package Refactoring;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntegerList {
    static Scanner scanner = new Scanner(System.in);
    static List<Integer> integerList = new ArrayList<>();

    static void printInputMessage() {
        System.out.println("Enter integer ( 0 or minus for Exit)");
    }

    static void closeInput() {
        scanner.close();
    }

    static List<Integer> getIntegerList() {
        while (true) {
            int number = scanner.nextInt();
            if (number <= 0)
                break;
            integerList.add(number);
        }
        return integerList;
    }
}