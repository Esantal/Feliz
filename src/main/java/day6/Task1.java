package day6;

public class Task1 {
    public static void main(String[] args) {
        Motorbike myMoto = new Motorbike("M-72","Красный",1941);
        myMoto.info();
        System.out.println("Разница = "+myMoto.yearDifference(1941)+"\n");

        Car myCar = new Car();
        myCar.setModel("Лада Седан");
        myCar.setColor("Баклажан");
        myCar.setYear(2013);
        myCar.info();
        System.out.println("Разница = "+myCar.yearDifference(2024));

    }
}
