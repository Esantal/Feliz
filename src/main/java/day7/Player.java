package day7;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100; // не делал приватными, чтоб была от  них польза
    public static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6)
            countPlayers++;

    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina--;
            if (stamina == 0){
                countPlayers--;
            }
        }
    }

    public static void info() {
        if (countPlayers < 5 && countPlayers > 1) {
            System.out.printf("Команды неполные. На поле еще есть %d свободных места", 6 - countPlayers);
        } else {
            switch (countPlayers) {
                case 6: // у case нет перечисления? case 2,3,4: или он только по отдельным работает?
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
