package stream;

import java.util.DoubleSummaryStatistics;
import java.util.List;

public class GroupingAggregationwithStreams {
    public static void main(String[] args) {
        List<Double> prices = List.of(1200.0, 800.0, 450.0, 300.0, 50.0, 25.0, 1500.0, 700.0, 950.0);

        DoubleSummaryStatistics stats = prices.stream()
            .filter(e -> e > 300.0)
            .mapToDouble(Double::doubleValue)
            .summaryStatistics();

        System.out.println("Count: " + stats.getCount());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Sum: " + stats.getSum());
    }
}
