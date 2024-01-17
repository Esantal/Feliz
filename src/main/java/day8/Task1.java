package day8;

public class Task1 {
    public static void main(String[] args) {
        String p =new String();
        long startTime = System.currentTimeMillis();
        for (int i=0;i<20001; i++){
            p=p+i+" ";
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.:" + (stopTime - startTime));

        StringBuilder q=new StringBuilder();
        long startTime2 = System.currentTimeMillis();
        for (int i=0;i<20001; i++){
            q.append(i+" ");
        }
        long stopTime2 = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.:" + (stopTime2 - startTime2));



    }
}
