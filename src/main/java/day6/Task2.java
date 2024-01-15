package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane yak1 = new Airplane("ОКБ Яковлева", 1941, 8.48, 2950);
        yak1.info();
        yak1.setYear(1942);
        yak1.setLength(8.60);
        yak1.fillUp(1.525);
        yak1.fillUp(1.475);
        yak1.info();

    }
}
