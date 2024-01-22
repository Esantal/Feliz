package day11.task1;


public class Courier implements Worker {
    private int salary = 0;// можно было не обозначать
    private String isPayed = "Бонус не был выплачен";
    private Warehouse wCourier;
    private int bonusCounter = 0;// можно было не обозначать


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

    public Courier(Warehouse wCourier) {
        this.wCourier = wCourier;
    }

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
