package collection.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1004, "Заур");
        map1.put(1003, "Виктор");
        map1.put(1002, "Александра");
        map1.put(1001, "Михаил");
        map1.put(1000, "Андрей");
        System.out.println("......1..... " + map1.toString());
        map1.put(1005, "Андрей");
        System.out.println("......2..... " + map1.toString());
        map1.put(1002, "Семён");
        System.out.println("......3..... " + map1.toString());
        map1.put(null, "Платон");
        System.out.println("......4..... " + map1.toString());
        map1.put(1006, null);
        System.out.println("......5..... " + map1.toString());
        map1.put(null, "ПИТОН");
        System.out.println("......6..... " + map1.toString());
        map1.putIfAbsent(1000, "Хер с горы");
        System.out.println("......7..... " + map1.get(1003));
        map1.remove(1004);
        System.out.println("......8..... " + map1.toString());
        System.out.println("......9..... " + map1.containsValue("Иван"));
        System.out.println("......10.... " + map1.containsKey(1000));
        System.out.println("......11.... " + map1.keySet());
        System.out.println("......12.... " + map1.values());

        Map<String, String> map2 = new HashMap<>();
        map2.put("Andrey", "Delacroix");
        map2.put("Victor", "Shishkin");
        map2.put("Victor", "Delacroix");
        map2.put("Selena", "Gomez");
        System.out.println(map2.toString());


    }
}
