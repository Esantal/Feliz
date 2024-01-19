package day9.Task1;

public class Student extends Human {
    private String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Этот студент с именем "+super.getName());// в решенни поменяли name с приват на протектед и ссылались на name без всего. Так же можно убрать super
    }
}
