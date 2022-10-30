package Scanner;

import java.util.Scanner;

public class Scanner1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пару строк...");
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println("Вы написали: \n" + s1 + "\n" + s2);

    }
}
