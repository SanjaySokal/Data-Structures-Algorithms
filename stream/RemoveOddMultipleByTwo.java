package stream;
import java.util.List;

public class RemoveOddMultipleByTwo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 8, 12, 5, 6, 17, 9, 2, 15);

        List<Integer> list = numbers.stream().filter(e -> e % 2 == 0).map(e -> e * 2).toList();

        System.out.println(list);
    }
}
