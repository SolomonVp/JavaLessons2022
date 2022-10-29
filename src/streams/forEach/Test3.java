package streams.forEach;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};

        Arrays.stream(array)
                .forEach(element -> {element*=2; System.out.print(element + " ");});
        System.out.println("\n------------------------------");

        Arrays.stream(array)
                .forEach(element -> System.out.print(element + " "));
        System.out.println("\n------------------------------");

        Arrays.stream(array)
                .forEach(System.out::println);
        System.out.println("\n------------------------------");

        Arrays.stream(array)
                .forEach(Utils::myMethod);
        System.out.println("\n------------------------------");

        Arrays.stream(array)
                .forEach(element -> Utils.myMethod(element));
        System.out.println("\n------------------------------");
    }
}

class Utils {
    public static void myMethod(int a) {
        a = a + 5;
        System.out.println("Element = " + a);
    }
}
