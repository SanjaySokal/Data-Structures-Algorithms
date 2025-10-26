package stream;

import java.util.List;

public class SortAndTransform {
    public static void main(String[] args) {
        List<String> names = List.of("sanjay", "Amit", "ravi", "Ramesh", "suresh", "Ajay");

        List<String> list = names.stream().sorted().map(String::toUpperCase).toList();
        System.out.println(list);
    }
}
