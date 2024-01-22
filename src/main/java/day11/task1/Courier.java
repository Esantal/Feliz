package day11.task1;

public class Courier implements Worker {
    private int salary = 0;
    private String isPayed = "Бонус не был выплачен";
    private Warehouse wCourier = new Warehouse();
    private int bonusCounter = 0;


    public int getSalary() {
        return salary;
    }

    public String getIsPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed='" + isPayed + '\'' +
                '}';
    }

    /*public Courier() {    - в задании написано сделать, но зачем если на ввод ничего не надо давать?
    }*/

    @Override
    public void doWork() {
        salary += 100;
        wCourier.plusCountDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (bonusCounter == 0) {
            if (wCourier.getCountDeliveredOrders() >= 10000) {
                salary += 50000;
                isPayed = "Бонус был выплачен";
                bonusCounter++;
            } else {
                System.out.println("Бонус пока не доступен");
            }
        } else {
            System.out.println("Бонус уже был выплачен");
        }

    }
    public int getWCourier() {
        return wCourier.getCountDeliveredOrders();
    }
}
