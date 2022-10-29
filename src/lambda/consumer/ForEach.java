package lambda.consumer;

import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List <String> list = List.of("privet", "kak dela", "normalno", "poka");
        for (String s : list) {
            System.out.println(s);
        }
        list.forEach(str -> System.out.println(str));
    }
}
