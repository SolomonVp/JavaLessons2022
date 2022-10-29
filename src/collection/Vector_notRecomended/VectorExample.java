package collection.Vector_notRecomended;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Миша");
        vector.add("Олег");
        vector.add("Катя");
        vector.add("Заур");
        System.out.println(vector.toString());
        System.out.println(vector.get(0));
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        System.out.println(vector.toString());
        vector.remove(0);
        System.out.println(vector.toString());
    }
}
