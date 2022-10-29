package streams.map;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Test1_2 {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Привет!");
        set.add("Как дела?");
        set.add("Хорошо.");
        set.add("Пока!");
        System.out.println(set);

        Set<Integer> set2 =
                set.stream().map(element -> element.length()).collect(Collectors.toSet());
        System.out.println(set2);

        List<Integer> list3 =
                set.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(list3);

        Set<Integer> set22 =
                set.stream().map(String::length).collect(Collectors.toSet());
        System.out.println(set22);
    }
}
