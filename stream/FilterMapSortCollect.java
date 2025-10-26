package stream;

import java.util.Comparator;
import java.util.List;

public class FilterMapSortCollect {
    public static void main(String[] args) {
        List<String> names = List.of("sanjay", "Amit", "ravi", "Ramesh", "suresh", "Ajay", "Ankit", "Ravi");

        List<String> list = names.stream()
                .map(String::toUpperCase)
                .filter(e -> e.startsWith("A") || e.startsWith("R"))
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();
        
        System.out.println(list);
    }
}
