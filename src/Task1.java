import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

/**
 * Дан список объектов типа Person, где каждый объект содержит имя и возраст. Используя
 * Stream API, сгруппируйте людей по возрасту и выведите результат в виде мапы, где ключ
 * — возраст, а значение — список имен.
 *
 * Используйте метод collect(Collectors.groupingBy) для группировки.
 * Выведите результат на экран.
* */
public class Task1 {
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Person> peopleList = Arrays.asList(
                new Person("John", 25),
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 30),
                new Person("David", 20)
        );

        Map<Integer, String> personGroupedByAge = peopleList.stream()
                .collect(groupingBy(
                        Person::getAge,
                        Collectors.mapping(Person::getName, Collectors.joining(", ", "[", "]"))
                ));

        System.out.println(personGroupedByAge);

        /*personGroupedByAge.forEach(((age, people) -> {
            String collect = people.stream()
                    .map(Person::getName)
                    .collect(Collectors.joining(", ", "[", "]"));

            String format = String.format("%s=%s, ", age, collect);
            System.out.print(format);
        }));
    }*/
    }
}
