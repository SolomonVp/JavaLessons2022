package streams.count;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountL {
    public static void main(String[] args) {
        Stream<Integer> stream5 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        System.out.println(stream5.count());
        System.out.println(stream5.distinct().count());
    }
}
