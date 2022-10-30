package Scanner;

import java.util.Scanner;

public class Scanner1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа...");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Частное равно: " + x / y);
        System.out.println("Остаток равен: " + x % y);


    }
}
