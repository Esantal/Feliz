package day11.task1;

public class Picker implements Worker {
    private int salary;
    private String isPayed;
    private Warehouse wPicker =new Warehouse();
    private int bonusCounter =0;

    public int getSalary() {
        return salary;
    }

    public String getIsPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed='" + isPayed + '\'' +
                '}';
    }

    /*public Picker() {
    }*/
    public void doWork() {
        salary += 80;
        wPicker.plusCountPickedOrders();
    }

    public void bonus() {
        if (bonusCounter == 0) {
            if (wPicker.getCountPickedOrders() >= 10000) {
                salary += 70000;
                isPayed = "Бонус был выплачен";
                bonusCounter++;
            } else {
                System.out.println("Бонус пока не доступен");
            }
        } else {
            System.out.println("Бонус уже был выплачен");
        }

    }

    public int getWPicker() {
        return wPicker.getCountPickedOrders();
    }
}
