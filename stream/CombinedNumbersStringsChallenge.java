package stream;

import java.util.List;
import java.util.stream.Collectors;

public class CombinedNumbersStringsChallenge {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Laptop", 1200),
                new Product("Phone", 800),
                new Product("Tablet", 450),
                new Product("Monitor", 300),
                new Product("Keyboard", 50),
                new Product("Mouse", 25),
                new Product("Laptop", 1200),
                new Product("Phone", 800));

        List<String> list = products.stream()
                .filter(e -> e.price() > 300)
                .collect(Collectors.toMap(Product::name, Product::price, (exe, replace) -> exe))
                .keySet().stream()
                .sorted().toList();

        System.out.println(list);
    }
}

record Product(String name, double price) {
}
