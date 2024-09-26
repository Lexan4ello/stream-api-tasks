import java.util.Arrays;
import java.util.List;

/**
 * Дан список строк, в котором могут встречаться дубликаты. Необходимо с помощью
 * Stream API удалить дубликаты, отсортировать строки в лексикографическом порядке и
 * вывести результат.
 * Условия:
 * Используйте метод distinct для удаления дубликатов.
 * Примените метод sorted для сортировки.
* */
public class Task7 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "pear");

        List<String> list = words.stream()
                .distinct()
                .sorted()
                .toList();

        System.out.println(list);
    }
}
