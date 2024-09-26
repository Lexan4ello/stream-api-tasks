import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Task6 {
    public static void main(String[] args) {
        List<Task1.Person> people = Arrays.asList(
                new Task1.Person("John", 25),
                new Task1.Person("Alice", 30),
                new Task1.Person("Bob", 20),
                new Task1.Person("Charlie", 35),
                new Task1.Person("David", 40)
        );

        double average = people.stream()
                .mapToInt(Task1.Person::getAge)
                .average()
                .getAsDouble();

        System.out.println(average);
    }
}
