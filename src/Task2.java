import java.util.List;

/**
 * 2. Дан список строк. Найти количество уникальных
 * строк длиной более 8 символов.
 */

public class Task2 {
    public static void main(String[] args) {
        List<String> strings = List.of(
                "String-1",
                "String-2",
                "String-3",
                "String-4",
                "String-5",
                "String-6",
                "String-10",
                "String-10",
                "String-10",
                "String-12",
                "String-16"
        );
        long result = strings.stream()
                .filter(string -> string.length() > 8)
                .distinct()
                .count();
        System.out.println(result);

    }
}
