package day2;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите число этажей в здании: ");
        int number = s.nextInt();
        if (number <= 4 && number >= 1) {
            System.out.println("Малоэтажный дом");
        } else if (number <= 8 && number >= 5) {
            System.out.println("Среднеэтажный дом");
        } else if (number >= 9) {
            System.out.println("Многоэтажный дом");
        } else System.out.println("Ошибка ввода");


    }
}
