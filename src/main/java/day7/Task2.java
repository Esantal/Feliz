package day7;

import java.util.Random;

import static day7.Player.MAX_STAMINA;
import static day7.Player.MIN_STAMINA;

public class Task2 {
    public static void main(String[] args) {
        Random r = new Random();
        Player p1 = new Player(r.nextInt((MAX_STAMINA / 10) + (MAX_STAMINA / 10 * 9)));
        Player p2 = new Player(r.nextInt((MAX_STAMINA / 10) + (MAX_STAMINA / 10 * 9)));
        Player p3 = new Player(r.nextInt((MAX_STAMINA / 10) + (MAX_STAMINA / 10 * 9)));
        Player p4 = new Player(r.nextInt((MAX_STAMINA / 10) + (MAX_STAMINA / 10 * 9)));
        Player p5 = new Player(r.nextInt((MAX_STAMINA / 10) + (MAX_STAMINA / 10 * 9)));
        Player p6 = new Player(r.nextInt((MAX_STAMINA / 10) + (MAX_STAMINA / 10 * 9)));
        System.out.println("Ввели 6 игроков и на поле: " + Player.getCountPlayers() + "\n");
        Player p7 = new Player(r.nextInt((MAX_STAMINA / 10) + (MAX_STAMINA / 10 * 9)));
        Player p8 = new Player(r.nextInt((MAX_STAMINA / 10) + (MAX_STAMINA / 10 * 9)));
        System.out.println("Ввели 8 игроков, а на поле: " + Player.getCountPlayers() + "\n");
        Player.info();
        for (int i = p1.getStamina() + 1; i > MIN_STAMINA; i--) {
            p1.run();
        }
        Player.info();
        for (int i = p2.getStamina() + 1; i > MIN_STAMINA; i--) {
            p2.run();
        }
        Player.info();
        System.out.println();
        for (int i = p3.getStamina() + 1; i > MIN_STAMINA; i--) {
            p3.run();
        }
        Player.info();
        System.out.println();
        for (int i = p4.getStamina() + 1; i > MIN_STAMINA; i--) {
            p4.run();
        }
        Player.info();
        System.out.println();
        for (int i = p5.getStamina() + 1; i > MIN_STAMINA; i--) {
            p5.run();
        }
        Player.info();
        System.out.println();
        for (int i = p6.getStamina() + 1; i > MIN_STAMINA; i--) {
            p6.run();
        }
        Player.info();
        System.out.println();


    }
}
