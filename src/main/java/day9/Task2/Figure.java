package day9.Task2;

public abstract class Figure {
    private String color;
    private double area;
    private double perimetr;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double area();

    public abstract double perimeter();
}
