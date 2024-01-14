package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] mat = new int[12][8];

        int summax =0;
        int index =0;
        for(int i=0; i< mat.length; i++){
            int sum =0;
            for( int j=0;j< mat[i].length;j++){
                mat[i][j]=random.nextInt(50);
                sum +=mat[i][j];

                            } if (sum>=summax){
                summax=sum;
                index = i;


            }

        }
        System.out.println(index);

    }
}
