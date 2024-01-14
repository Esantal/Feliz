package day4;


import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] rnumbers = new int[size];
        int u8 = 0;
        int e1 = 0;
        int even = 0;
        int odd = 0;
        int summ = 0;
        Random random = new Random();
        for (int i = 0; i < rnumbers.length; i++) {
            rnumbers[i] = random.nextInt(11);
        }

        for (int result : rnumbers) {
            System.out.print(result + " ");
            System.out.println();
            if (result > 8) {
                u8++;
            }
            if (result == 1) {
                e1++;
            }
            if (result % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            summ = summ + result;
        }

        System.out.println("Длина массива: " + size);
        System.out.println("Количество чисел больше 8: " + u8);
        System.out.println("Количество чисел равных 1: " + e1);
        System.out.println("Количество четных: " + even);
        System.out.println("Количество нечетных: " + odd);
        System.out.println("Cумма: " + summ);

    }
}


