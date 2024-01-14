package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        int summax=0;
        int index=0;
        for (int i = 0; i < array.length; i++){
            int sum = 0;
            array[i] = random.nextInt(10000);

            if(i>1){
                sum=array[i-2]+array[i-1]+array[i];
            }
            if (sum>summax){
                summax=sum;
                index=i-2;
            }


    }

        System.out.println(summax);
        System.out.println(index);
}}
