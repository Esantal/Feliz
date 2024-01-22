package day11.task1;

public class Picker implements Worker {
    private int salary;// можно было не обозначать
    private String isPayed;// про неё совсем забыл и перевел её функционал на bonusCounter
    private Warehouse wPicker;
    private int bonusCounter = 0;// можно было не обозначать

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

    public Picker(Warehouse wPicker) {
        this.wPicker = wPicker;
    }

    public void doWork() {
        salary += 80;// в решении через переменную
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
        /* в решении
        if (wPicker.getCountPickedOrders()<10_000){ _ можно отделять тысячи
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed){
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary+=70000;
        isPayed=true;*/

    }

    public int getWPicker() {
        return wPicker.getCountPickedOrders();
    }
}
