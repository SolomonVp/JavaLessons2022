package Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = null;
        Set<String> set = new TreeSet<>();

        try {
            scanner = new Scanner(new FileReader(new File("D:\\Java\\Projects\\JavaUdemy\\JavaCourse\\txtForScanner.txt")));

            scanner.useDelimiter("\\W");

            while (scanner.hasNext()) {
                String word = scanner.next();
                set.add(word);
            }
            for (String word : set) {
                System.out.println(word);
            }

        } catch (FileNotFoundException e) {
            System.out.println("У тебя проблемы?");
        }
        finally {
            scanner.close();
        }
    }
}
