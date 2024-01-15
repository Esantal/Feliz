package day5;

public class Task1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setModel("Лада Седан");
        myCar.setColor("Баклажан");
        myCar.setYear(2013);
        System.out.println("Модель: " + myCar.getModel()+"\nЦвет: "+ myCar.getColor()+"\nГод: " + myCar.getYear());
            }
}

