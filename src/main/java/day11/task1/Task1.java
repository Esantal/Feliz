package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse=new Warehouse();
        Courier courier = new Courier();
        Picker picker = new Picker();
        businessProcess(picker);
        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders()+10000);
        businessProcess(picker);
        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders()+10000);
        businessProcess(courier);
        warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders()+10000);
        System.out.println("Собрано: "+warehouse.getCountPickedOrders()+"\nДоставлено: "+warehouse.getCountDeliveredOrders()+"\nЗп сборщика: "+picker.getSalary()+"\nЗп курьера: "+courier.getSalary()+"\n");
        Warehouse warehouse2=new Warehouse();
        Courier courier2 = new Courier();
        Picker picker2 = new Picker();
        picker2.doWork();
        warehouse2.setCountPickedOrders(warehouse2.getCountPickedOrders()+1);
        courier2.doWork();
        warehouse2.setCountDeliveredOrders(warehouse2.getCountDeliveredOrders()+1);
        courier2.doWork();
        warehouse2.setCountDeliveredOrders(warehouse2.getCountDeliveredOrders()+1);
        System.out.println("Собрано: "+warehouse.getCountPickedOrders()+"\nДоставлено: "+warehouse.getCountDeliveredOrders()+"\nЗп сборщика: "+picker.getSalary()+"\nЗп курьера: "+courier.getSalary()+"\n");
        System.out.println("Собрано: "+warehouse2.getCountPickedOrders()+"\nДоставлено: "+warehouse2.getCountDeliveredOrders()+"\nЗп сборщика: "+picker2.getSalary()+"\nЗп курьера: "+courier2.getSalary()+"\n");
    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++){
            worker.doWork();
        }
        worker.bonus();
    }
}
