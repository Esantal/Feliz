package day7;

import java.util.Random;

import static day7.Player.MIN_STAMINA;

public class Task2 {
    public static void main(String[] args) {
        Random r = new Random();
        Player p1 = new Player(r.nextInt(10) + 90);
        Player p2 = new Player(r.nextInt(10) + 90);
        Player p3 = new Player(r.nextInt(10) + 90);
        Player p4 = new Player(r.nextInt(10) + 90);
        Player p5 = new Player(r.nextInt(10) + 90);
        Player p6 = new Player(r.nextInt(10) + 90);
        System.out.println("Ввели 6 игроков и на поле: " + Player.countPlayers + "\n");
        Player p7 = new Player(r.nextInt(10) + 90);
        Player p8 = new Player(r.nextInt(10) + 90);
        System.out.println("Ввели 8 игроков, а на поле: " + Player.countPlayers + "\n");
        Player.info();
        for (int i = p1.getStamina() + 1; i > MIN_STAMINA; i--) {
            Player.run(p1);
        }
        Player.info();
        for (int i = p2.getStamina() + 1; i > MIN_STAMINA; i--) {
            Player.run(p2);
        }
        Player.info();
        System.out.println();
        for (int i = p3.getStamina() + 1; i > MIN_STAMINA; i--) {
            Player.run(p3);
        }
        Player.info();
        System.out.println();
        for (int i = p4.getStamina() + 1; i > MIN_STAMINA; i--) {
            Player.run(p4);
        }
        Player.info();
        System.out.println();
        for (int i = p5.getStamina() + 1; i > MIN_STAMINA; i--) {
            Player.run(p5);
        }
        Player.info();
        System.out.println();
        for (int i = p6.getStamina() + 1; i > MIN_STAMINA; i--) {
            Player.run(p6);
        }
        Player.info();
        System.out.println();


    }
}
