import java.util.List;
import java.util.OptionalDouble;

/**
 * 1. Дан список целых чисел. Найти среднее всех
 * нечётных чисел, делящихся на 5.
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 4, 5, 6, 7, 8, 9, 12, 14, 15, 20, 25, 10);
        OptionalDouble average = list.stream()
                .filter(value -> value % 2 != 0)
                .filter(value -> value % 5 == 0)
                .mapToInt(Integer::intValue)
                .average();
        average.ifPresent(System.out::println);
    }

}
