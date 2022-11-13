package Refactoring;
import java.util.List;

public class Product {
    static long product = 1;

    static long getProduct(List<Integer> integer_list){
        for (int number : integer_list) {
            product *= number;
        }
        return product;
    }
    
    static void printProduct(long product){
        System.out.println("Product: " + product);
    }
}