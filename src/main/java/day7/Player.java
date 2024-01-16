package day7;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    public static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public static void run(Player q) {
        if (q.stamina == MIN_STAMINA) {
            countPlayers--;
        } else {
            q.stamina--;
        }
    }

    public static void info() {
        if (countPlayers < 5 && countPlayers > 1) {
            System.out.printf("Команды неполные. На поле еще есть %d свободных места", 6 - countPlayers);
        } else {
            switch (countPlayers) {
                case 6:
                    System.out.println("На поле нет свободных мест");
                    break;
                case 5:
                    System.out.println("Команды неполные. На поле еще есть 1 свободное место");
                    break;
                default:
                    System.out.printf("Команды неполные. На поле еще есть %d свободных мест", 6 - countPlayers);
                    break;
            }

        }
    }
}
