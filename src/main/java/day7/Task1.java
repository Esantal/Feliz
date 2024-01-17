package day7;


public class Task1 {
    public static void main(String[] args) {
        Airplane yak1 = new Airplane("ОКБ Яковлева", 1941, 8.48, 2950);
        Airplane il1 = new Airplane("ОКБ Ильюшина", 1943, 11.12, 5320);
        Airplane.compareAirplanes(yak1, il1);
    }
}
