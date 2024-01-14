package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            i++;
            System.out.print("Введите делимое:");
            double delimoe = scanner.nextDouble();
            System.out.print("Введите делитель:");
            double delitel = scanner.nextDouble();
            if (delitel == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println("Результат: " + delimoe / delitel);
        }

    }
}
