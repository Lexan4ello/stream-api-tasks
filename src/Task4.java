import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
/**
 * Есть список объектов типа Product (свойства: id, name, price). Необходимо
 * преобразовать этот список в мапу, где ключом будет id продукта, а значением — объект
 * Product.
 * Условия:
 * Используйте метод collect(Collectors.toMap) для преобразования в мапу.
 * В случае одинаковых ключей выбрасывайте исключение с описанием ошибки.
* */
public class Task4 {
    record Product(int id, String name, double price) {}

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product(1, "Laptop", 1200.0),
                new Product(2, "Phone", 800.0),
                new Product(3, "Tablet", 600.0)
        );

        Map<Integer, Product> map = products.stream()
                .collect(Collectors.toMap(Product::id, Function.identity()));
        System.out.println(map);
    }
}
