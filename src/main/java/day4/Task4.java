package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        int summax = 0;
        int index = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        for (int x : array) {
            System.out.print(x + " ");
        }

        for (int i = 0; i < array.length - 2; i++) {
            sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += array[j];
            }
            if (sum > summax) {
                summax = sum;
                index = i;
            }
        }
        System.out.println("\n");
        System.out.println(summax);
        System.out.println(index);
    }
}


