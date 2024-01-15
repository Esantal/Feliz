package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike myMotorbike = new Motorbike("M-72", "Красный", 1941);
        System.out.println("Модель: " + myMotorbike.getModel()+"\nЦвет: "+ myMotorbike.getColor()+"\nГод: " + myMotorbike.getYear());
    }
}

