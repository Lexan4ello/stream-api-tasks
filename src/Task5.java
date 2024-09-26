import java.util.*;
/**
 * Дан список целых чисел. Необходимо с помощью Stream API найти второй по величине
 * элемент в списке.
 * Условия:
 * Отсортируйте список с помощью sorted в порядке убывания.
 * Используйте метод skip(1) для пропуска первого (наибольшего) элемента и
 * findFirst для получения второго элемента.
 * */
public class Task5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 8, 12, 3, 7, 9, 10);

        Integer secondMax = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();

        System.out.println(secondMax);
    }
}
