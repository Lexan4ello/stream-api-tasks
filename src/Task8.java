import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Дан список объектов типа Product (свойства: id, name, price). С помощью Stream API
 * найдите три продукта с наибольшей ценой.
 * Условия:
 * Отсортируйте список по цене с помощью метода sorted.
 * Используйте метод limit для получения первых трех элементов.
* */

public class Task8 {
    public static void main(String[] args) {
        List<Task4.Product> products = Arrays.asList(
                new Task4.Product(1, "Laptop", 1200.0),
                new Task4.Product(2, "Phone", 800.0),
                new Task4.Product(3, "Tablet", 600.0),
                new Task4.Product(4, "Monitor", 300.0),
                new Task4.Product(5, "Keyboard", 100.0)
        );

        List<Task4.Product> list = products.stream()
                .sorted(Comparator.comparing(Task4.Product::price).reversed())
                .limit(3)
                .toList();

        System.out.println(list);
    }
}
