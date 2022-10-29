package streams.distinct;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctL {
    public static void main(String[] args) {
        Stream<Integer> stream5 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        stream5.distinct().forEach(System.out::println);
    }
}
