package Scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число...");
        int i = scanner.nextInt();
        System.out.println("Вы ввели: " + i);
    }
}
