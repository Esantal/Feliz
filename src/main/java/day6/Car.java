package day6;

import static java.lang.Math.abs;

public class Car {

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

    void info() {
        System.out.println("Это автомобиль");
    }

    int yearDifference(int inputYear) {

        return abs(inputYear - year);// предположил, что как в экселе должен быть модуль
    }

}



