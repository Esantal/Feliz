package day5;

public class Task1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setModel("Лада Седан");
        myCar.setColor("Баклажан");
        myCar.setYear(2013);
        System.out.println("Модель: " + myCar.getModel());
        System.out.println("Цвет: " + myCar.getColor());
        System.out.println("Год: " + myCar.getYear());
    }
}

class Car {
    private String model;

    public void setModel(String userModel) {
        model = userModel;
    }

    public String getModel() {
        return model;
    }

    private String color;

    public void setColor(String userColor) {
        color = userColor;
    }

    public String getColor() {
        return color;
    }

    private int year;

    public void setYear(int userYear) {
        year = userYear;
    }

    public int getYear() {
        return year;
    }


}