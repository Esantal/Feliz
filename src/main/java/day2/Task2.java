package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите меньшее число: ");
        int a = s.nextInt();
        System.out.print("Введите большее число: ");
        int b = s.nextInt();
        a++;
        for (; a < b; a++) {
            if (a % 5 == 0 && a % 10 != 0) {
                System.out.print(a + " ");
            }

        }

    }
}
