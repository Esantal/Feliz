package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите делимое:");
            double delimoe = scanner.nextDouble();
            System.out.print("Введите делитель:");
            double delitel = scanner.nextDouble();
            if (delitel == 0) {
                break;
            } else {// можно убрать, т.к. есть break выше
                System.out.println("Результат: " + delimoe / delitel);
            }
        }
    }
}
