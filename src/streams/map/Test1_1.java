package streams.map;

import java.util.Arrays;

public class Test1_1 {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};

        array = Arrays.stream(array)
                .map(element -> {if (element % 3 == 0) {element = element/3;} return element;}).toArray();

        System.out.println(Arrays.toString(array));
    }
}
