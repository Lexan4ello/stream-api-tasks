import java.util.Arrays;
import java.util.List;

/**
 * Дан список чисел. Необходимо с помощью параллельного стрима возвести каждый
 * элемент в квадрат, найти сумму всех квадратов и вывести результат.
 * Условия:
 * Используйте parallelStream для параллельной обработки.
 * Примените методы map и reduce для выполнения возведения в квадрат и
 * суммирования.
 * */
public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers
                .parallelStream()
                .mapToInt(x -> x * x)
                .reduce(Integer::sum)
                .getAsInt();

        System.out.println(sum);
    }
}
