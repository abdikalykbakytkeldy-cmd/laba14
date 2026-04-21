import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        // оставляем только чётные числа
        list.stream()
            .filter(x -> x % 2 == 0)
            .forEach(x -> System.out.println(x));
    }
}