package day7;

public class Airplane {
    private String manufacturer;
    private int year;
    private double length;
    private double weight;
    private double fuel;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }

    public Airplane(String manufacturer, int year, double length, double weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        fuel=0.0;
    }
    void info(){
        System.out.printf("Изготовитель: %s \nГод выпуска: %d год\nДлина: %.2f м\nВес: %.3f кг\nКоличество топлива в баке: %.3f л\n\n", manufacturer, year, length, weight, fuel);
    }
    public void fillUp(double n){
        fuel +=n;

    }
    public static void compareAirplanes(Airplane q, Airplane w){
        if (q.length>w.length){
            System.out.printf("Самолёт %s длинее",q.manufacturer);
        } else {
            System.out.printf("Самолёт %s длинее",w.manufacturer);
        }
    }
}
