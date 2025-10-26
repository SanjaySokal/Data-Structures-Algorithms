package stream;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class CountOccurance {
	public static void main(String[] args) {
		List<String> list = List.of("apple", "banana", "cherry", "apple", "date", "banana", "apple");

		Map<String, Long> newList = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

		System.out.println(newList);
	}
}
