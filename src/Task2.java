import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

/**
* Дан список строк, представляющий текст. Необходимо подсчитать частоту каждого слова
 * в тексте и вывести результат в виде мапы, где ключ — это слово, а значение —
 * количество его вхождений.
 * Условия:
 * Разбейте каждую строку на слова с помощью flatMap.
 * Используйте метод collect(Collectors.groupingBy(Function.identity(),
 * Collectors.counting())) для подсчета количества вхождений.
* */
public class Task2 {
    public static void main(String[] args) {
        List<String> text = Arrays.asList("apple banana apple", "banana orange banana", "orange apple banana");
        Map<String, Long> collect = text.stream()
                .flatMap(string -> Stream.of(string.split(" ")))
                .collect(groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);
    }
}
