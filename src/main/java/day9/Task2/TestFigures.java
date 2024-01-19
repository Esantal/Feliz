package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = { // полиморфизм. можно вызывать только переопределенные унаследованные методы. Если бы были уникальные для треуг, круга или прямоуг, то они бы не вызвались
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };


        System.out.println(calculateRedArea(figures));
        System.out.println(calculateRedPerimeter(figures));


    }

    public static double calculateRedPerimeter(Figure[] figures) {// тут была ошибка. пока не вывел из тела метода main. Посмотрев решение переместил за тело main и всё норм. Метод в методе не может быть или почему ошибка была?
        double sumPerimeter = 0;
        for (int i = 0; i < figures.length; i++) { // надо было использовать for(Figure(имя класса) figure(новый объект): figures(имя созданного объекта)). цикл for each
            if ("Red".equals(figures[i].getColor())) { // в решении не было указания на элемент массива из за другого цикла for.
                sumPerimeter += figures[i].perimeter();
            }
        }
        return sumPerimeter;
    }

    public static double calculateRedArea(Figure[] figures) {
        double sumArea = 0;
        for (int i = 0; i < figures.length; i++) {
            if ("Red".equals(figures[i].getColor())) {
                sumArea += figures[i].area();
            }
        }
        return sumArea;
    }

}


