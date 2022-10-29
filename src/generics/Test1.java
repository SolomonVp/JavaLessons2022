package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
//        list.add("OK");
//        list.add(123);
//        list.add(new StringBuilder("dslkfjhsd"));
//        list.add(new Car());
        list.add("privet");
        list.add("poka");
        list.add("ok");
        list.add("vlk");
//        list.add(new Car());

        for (Object o :
                list) {
            System.out.println(o + " dlina " + ((String)o).length());
        }
    }
}

class Car{

}
