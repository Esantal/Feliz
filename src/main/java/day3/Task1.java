package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 0;     // лишнее
        while (i != 1) { //while(true);
            System.out.print("Введите город: ");
            String town = s.nextLine();
            //if (town.equals("Stop"));
            //break;
            switch (town) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    continue;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    continue;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    continue;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    continue;
                default:
                    System.out.println("Неизвестная страна");
                    continue;
                case "Stop":// лишнее
                    i++;// лишнее
                    break;// лишнее


            }
        }
    }
}