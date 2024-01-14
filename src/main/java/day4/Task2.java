package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10001);
        int max = array[0];
        int min = array[0];
        int end0 = 0;
        int summend0 = 0;
        for (int result : array) {
            if (result > max)
                max = result;
            if (result < min)
                min = result;
            if (result % 10 == 0) {
                end0++;
                summend0 += result;
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(end0);
        System.out.println(summend0);
    }
}
