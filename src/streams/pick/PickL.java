package streams.pick;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PickL {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        Stream<Integer> stream5 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);

        System.out.println(stream5.distinct().peek(System.out::println).count());

    }
}
