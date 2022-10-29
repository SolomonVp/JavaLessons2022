package streams.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Привет!");
        list.add("Как дела?");
        list.add("Хорошо.");
        list.add("Пока!");
        System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
//        System.out.println(list);

        List<Integer> list2 = list.stream()
                .map(element -> element.length())
                .collect(Collectors.toList());
        System.out.println(list2);
        System.out.println(list2);
    }
}
