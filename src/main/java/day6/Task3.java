package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher Ivanova = new Teacher("Елена Ивановна", "Биология");
        Teacher Kimko = new Teacher("Елена Григорьевна", "Русский");
        Student balbes1 = new Student("Васечкин");
        Student balbes2 = new Student("Петров");
        Ivanova.evaluet(balbes1);
        Ivanova.evaluet(balbes2);
        Kimko.evaluet(balbes2);
        Kimko.evaluet(balbes1);

    }
}
