package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите два числа через пробел: ");
        int a = s.nextInt();
        int b = s.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
        } else {
            a++;
            while (a < b) {
                if (a % 5 == 0 && a % 10 != 0) {
                    System.out.print(a + " ");
                    a++;
                }

            }

        }
    }
}
