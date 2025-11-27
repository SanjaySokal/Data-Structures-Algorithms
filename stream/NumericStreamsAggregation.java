package stream;

import java.util.List;

public class NumericStreamsAggregation {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 8, 12, 5, 6, 17, 9, 2, 15, 8);

        int sum = numbers.stream()
        .distinct()
        .filter(e -> e > 5)
        .mapToInt(e -> e * 3).sum();

        System.out.println(sum);
    }
}
