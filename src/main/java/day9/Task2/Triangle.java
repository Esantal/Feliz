package day9.Task2;

import static java.lang.Math.sqrt;

public class Triangle extends Figure {
    private double s1;
    private double s2;
    private double s3;

    public Triangle(double s1, double s2, double s3, String color) {
        super(color);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public double area() {
        double p = ((s1 + s2 + s3) / 2);// можно было вызвать метод perimeter()
        return sqrt(p * (p - s1) * (p - s2) * (p - s3));
    }

    public double perimeter() {
        return s1 + s2 + s3;
    }
}
